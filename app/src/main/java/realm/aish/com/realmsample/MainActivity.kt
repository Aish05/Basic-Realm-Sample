package realm.aish.com.realmsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*
import realm.aish.com.realmsample.model.Student

class MainActivity : AppCompatActivity() {
    private lateinit var realm: Realm


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        realm = Realm.getDefaultInstance()
        btn_save.setOnClickListener {
            saveData()
        }

    }

    private fun saveData() {
        realm.executeTransactionAsync({
            val student = it.createObject(Student::class.java)
            student.name = edittextName.text.toString()
            student.age = edittextAge.text.toString().toInt()
        }, {
            Log.d("TAG", "On Success: Data Written Successfully!")
            readData()
        }, {
            Log.d("TAG", "On Error: Error in saving Data! ${it.message}")
        })
    }

    private fun readData() {
        val students = realm.where(Student::class.java).findAll()
        var response = ""
        students.forEach {
            response = response + "Name: ${it.name}, Age: ${it.age}" + "\n"
        }
        db_response.text = response
    }
}

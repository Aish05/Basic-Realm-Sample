package realm.aish.com.realmsample

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration


class MyApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        Realm.init(this)

        val config = RealmConfiguration.Builder().build()
        Realm.setDefaultConfiguration(config)


        /*
RealmConfiguration myConfig = new RealmConfiguration.Builder(context)
        .name("myrealm.realm").
.schemaVersion(2)
        .setModules(new MyCustomSchema())
        .build();

RealmConfiguration otherConfig = new RealmConfiguration.Builder(context)
        .name("otherrealm.realm")
        .schemaVersion(5)
        .setModules(new MyOtherSchema())
        .build();

Realm myRealm = Realm.getInstance(myConfig);
Realm otherRealm = Realm.getInstance(otherConfig);
*/
    }

}
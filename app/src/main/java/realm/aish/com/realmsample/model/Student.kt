package realm.aish.com.realmsample.model

import io.realm.RealmObject

/*
This Class is a Model class. But this is how we will create our Table in Realm.
All class should extend RealmObject.*/
open class Student(
    var name: String?= null,
    var age: Int?= null
) : RealmObject(){}
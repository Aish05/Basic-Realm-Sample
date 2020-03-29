package realm.aish.com.realmsample.realm


//class RealmController constructor(application: Application?) {
//    private var instance: RealmController? = null
//    private var realm: Realm? = null
//
//    init {
//        realm = Realm.getDefaultInstance()
//    }
//
//    //query example
//    fun queryedBooks(): RealmResults<St?>? {
//        return realm?.where(Book::class.java)
//            ?.contains("author", "Author 0")
//            ?.or()
//            ?.contains("title", "Realm")
//            ?.findAll()
//    }
//}
package com.example.delegate

interface DB {
    fun save()
}

class SqlDB() : DB {
    override fun save() {
        println("save to sql")
    }
}

class MySqlDB() : DB {
    override fun save() {
        println("save to MySqlDB")
    }
}

class OracleDB() : DB {
    override fun save() {
        println("save to oracle")
    }
}

class CreateDBAction(db: DB) : DB by db


//class CreateDBAction(@NotNull db: DB) : DB {
//    private val `$$delegate_0`: DB
//
//    init {
//        Intrinsics.checkNotNullParameter(db, "db")
//        super()
//        `$$delegate_0` = db
//    }
//
//    override fun save() {
//        `$$delegate_0`.save()
//    }
//}
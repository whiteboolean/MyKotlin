package com.example.delegate

import com.example.mykotlin.step_6.IUSB

interface IUsb {
    fun save()
}





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
package com.example.mykotlin.step_6

import com.example.mykotlin.p


interface IUSB{
    var usbVersionInfo:String //USB版本相关的信息
    var usbInsertDevice:String

    fun insertUSB():String
}



//.TODO 100-kotlin语言接口的定义
// 1.接口里面所有的成员和接口本身都是open的，所以不需要open，这是接口的特殊性
// 2.接口不能有主构造
// 3.接口类不仅仅要重写接口的函数，也要重写接口的成员
// 4.接口实现代码区域，全部都要增加 override关键字来修饰
class Mouse(override var usbInsertDevice: String = "Usb 3.0",
            override var usbVersionInfo: String = "鼠标接入了USB口"):IUSB {

    override fun insertUSB(): String {
        return "$usbVersionInfo,$usbInsertDevice"
    }
}

//键盘实现类
class keyboard : IUSB {
    override var usbVersionInfo: String= "USB 3.1"
        get() = "usb 3.1"
        set(value) {
            field = value
        }
    override var usbInsertDevice: String = "键盘接入了USB接口"
        get()  {
            p("@你获取了[${field}]值出去了")
            return field
        }
        set(value) {
            field = value
            println("@你set了[$value]值进来了")
        }


    override fun insertUSB(): String {
        return "keyboard $usbVersionInfo $usbInsertDevice"
    }


}


fun main() {
    val iUsb1 :IUSB = Mouse()
    println(iUsb1.insertUSB())
    println()
    val iUsb2:IUSB = keyboard()
    println(iUsb2.insertUSB())

}
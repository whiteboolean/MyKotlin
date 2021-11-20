package com.example.mykotlin.step_4

class KtBase78 {

    //lateinit val AAA; //AAA无法后面再修改了，我还怎么延时初始化


    lateinit var responseResult:String

    //模拟服务器加载
    fun loadRequest(){ //延时初始化 ,属于懒加载
        responseResult = "服务器加载成功，恭喜你"
    }

    fun showResponseResult(){
        //由于你没有给他初始化，所以只有用到它，就崩溃
        //判断lateinit 是否初始化
        if (::responseResult.isInitialized){
            println("responseResult:$responseResult")
        } else{
            println("暂未还没初始化:responseResult:$responseResult") //会崩溃
        }
    }
}


fun main(args: Array<String>) {
    val p = KtBase78()
//    p.loadRequest()

    p.showResponseResult()
}

package com.stupidfish

import com.stupidfish.color.Color
import com.stupidfish.struct.ActivationCodeStruct
import java.io.File
import java.io.FileNotFoundException
import kotlin.system.exitProcess

class core {
    companion object{

        fun run(args: Array<String>) {
            if (args.size == 1) {
                try {
                    println("${Color.TEXT_GREEN} ActivationCodeSender2.0 开始工作")
                    println("${Color.TEXT_GREEN} 读取中")
                    val file = File(args[0])
                    val lines = file.readLines()
                    println("${Color.TEXT_GREEN} 读取完毕")
                    println("${Color.TEXT_GREEN} 正在展示前三个 请手动确认发送${Color.TEXT_BLUE}(y/n)")
                    val confirm = readLine()
                    when (confirm) {
                        "y" -> {
                        }
                        "n" -> {
                            exitProcess(1)
                        }
                        else -> {
                            exitProcess(1)
                        }
                    }
                    for (i in 0..2) {
                        println("QQ:${lines[i][0]} 激活码:${lines[i][1]}")
                    }

                    //GlobalScope.launch {//开协程跑 防止卡顿
                    lines.forEach { it ->
                        //it为行String
                        val structString = it.split(" ")//以空格拆分字符串
                        val struct = ActivationCodeStruct()
                        struct.QQCode = structString[0]
                        struct.ActivationCode = structString[1]
                        //Send
                    }
                    //  }
                }catch (e: FileNotFoundException){
                    println("${Color.TEXT_RED}没有那个文件!")
                }
            } else {
                println("${Color.TEXT_RED} 请输入参数 eg:${Color.TEXT_GREEN} java -jar xxx.jar ${Color.TEXT_BLUE}qq.csv")
            }
        }
    }
}
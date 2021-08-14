package com.stupidfish

import com.stupidfish.color.Color
import com.stupidfish.struct.ActivationCodeStruct
import java.io.File
import java.io.FileNotFoundException
import kotlin.system.exitProcess

class Run {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            core.run(args)
        }
    }
}
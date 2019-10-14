package com.example.program

import kotlin.math.floor
import kotlin.math.sqrt

class FibonnaciChecker {

    fun isPerfectSq(entry: Long): Boolean {
        val sqRt = floor(sqrt(entry.toDouble())).toLong()
        println("sqrt: ${sqRt}")
        println((sqRt * sqRt).toLong())
        return (sqRt * sqRt) == entry
    }

    fun checkThis(number: Long) : Boolean {
        return isPerfectSq(5*number*number-4) || isPerfectSq(5*number*number+4)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            args.forEach {
                val num = it.toLong()
                val fib = FibonnaciChecker().checkThis(num)
                println("is $num a fib number ? $fib")
            }
        }
    }
}


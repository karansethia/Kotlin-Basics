package com.example.kotlinbasics

class DataClassKotlin {
    data class User(val Id: Long, val name : String)
    fun main(){
        val user1 = User(1,"Karan")
    }
    // basically we get some predefined functions and methods for the object as we would get for a normal data structure
}

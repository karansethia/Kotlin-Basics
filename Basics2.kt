package com.example.kotlinbasics

fun main(){
    function2()
    val sum = function3(2,4)
    println(sum)
    var name : String? = null  // declaration for nullable type (just add question mark after data type
    var age : Int? = 23   // ? -> safe call operator
    name = "Karan"
    var len = name?.length // getting length of a nullable variable

    // to print a value only if the value is not null
    name?.let {println(name as String)}

    // giving default value to a nullable if it is being assigned to another variable
    val nullableName = name ?: "Admin"  // ?: -> Elvis Operator
    println(nullableName)

    // steps to get nullpointexception just in case you need to make sure there is no null variable in the program
    println(name!!.lowercase())  // not null assertion operator
}
fun function2(){
    println("this is function 2")
}
fun function3(a: Int,b: Int): Int{
    return a+b
}
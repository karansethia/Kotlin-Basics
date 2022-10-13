package com.example.kotlinbasics

fun main(){
    var person1 = "Karan"
    print("$person1 is learning kotlin basics\n")

    // Data types in Kotlin
    var myStr : String = "Android MasterClass"
    var myfloat : Float = 13.38F
    var myDouble : Double = 3.14159265358979
    var myShort : Short = 25
    var myInt : Int = 2020
    var myLong : Long = 18881234567
    var myBool : Boolean = true
    var myChar : Char = 'a'
    println("${4>12}")

    // if else and operators is the same as java
    // switch case is renamed as when in kotlin
    var season = 3
    when(season) {
        1 -> println("Summer")
        2 -> println("winter")
        3 -> println("spring")
        4 -> {println("autumn")
            println("ALso known as Fall")
                }
        else -> print("there are no other seasons on earth")
    }
    var myAge = 21
    when(myAge){
        in 1..8 -> println("curious, happy")
        in 9..14 -> println("happy, focused, friendship")
        in 15..22 -> println("lone, depress, motivated")
        !in 2..50 -> println("you got nothing to worry about")  // the range is [0,2) U (50,infinite)
    }

    // checking data type using when
    var x : Any = 13.37 // x is of type object and is initialized by keyword any
    when(x){
        is Int -> print("$x is of type int")
        is Float -> print("$x is of type float")
        is Double -> print("$x is of type double\n")
        is Short -> print("$x is of type short")
    }
    // for loop
    for(num in 1..10){
        print("$num  ")
    }
    for(i in 1 until 5){
        print("karan ")
    }
    for(i in 10 downTo 1){
        print(i)
    }
    print("\n")
    for(i in 10 downTo 1 step 2){
        print(i)
    }
    var a = 0
    for (y in 0..9) {
        a += y
    }

    println("\n $a")
}

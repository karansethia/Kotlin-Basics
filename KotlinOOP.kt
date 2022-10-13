package com.example.kotlinbasics

fun main(){
   // Person()
    var karan = Person("Karan","Sethia")
    var kartik = Person("Kartik","Kumar")
    karan.stateHobby()
    kartik.hobby = "weight lifting"
    MobilePhone("Ios","Apple","Iphone 14 pro max")
}

class Person (firstName: String = "jack",lastName: String = "black"){
    // Member variable / properties
    var age: Int? = null
    var hobby : String = "playing basketball"
    // Initializer block
    init{
        print("Initializing new Person object with $firstName $lastName\n")
    }
    // secondary constructor
    constructor(firstName: String,lastName: String,age: Int)
            : this(firstName,lastName){
        this.age = age

            }
    fun stateHobby(){
        println("My hobby is $hobby")
    }
}

class MobilePhone(osName: String, brand: String, model: String){

    init{
        print("Your new $osName phone is $brand $model")
    }

}
package com.example.kotlinbasics

import java.lang.IllegalArgumentException

fun main(){
   // Person()
    var karan = Person("Karan","Sethia")
    var kartik = Person("Kartik","Kumar")
    karan.stateHobby()
    kartik.hobby = "weight lifting"
    kartik.stateHobby()
    MobilePhone("Ios","Apple","Iphone 14 pro max")
    var myCar = Car()
    myCar.owner  // will generate UninitializedPropertyAccessException if property is not initialized
    println(myCar.brandName)
    println(myCar.owner)
   // myCar.maxSpeed = -100 throws the IllegalArgumentException
   // myCar.model = "R6" cannot assign value ou
    println("${myCar.maxSpeed}")
}

class Car(){
    lateinit var owner : String  // lateinit is used when we dont want to initialize the var right at declaration
    var brandName : String = "Audi"
    get(){
        return field.lowercase()
    }
    var maxSpeed : Int = 250
    set(value) {
        field = if(value > 0) value else throw IllegalArgumentException("MaxSpeed cant be negative")
    }
    var model : String = "R8 V12"
        private set
    init {
        this.model = "R8 V10"  // can change the value of variable with private setter in init block
       this.owner = "Karan"
    }
}

class Person (firstName: String = "jack",lastName: String = "black"){
    // Member variable / properties
    var age: Int? = null
    var hobby : String = "playing basketball"
    var FirstName : String? = null
    // Initializer block
    init{
        this.FirstName = firstName
        print("Initializing new Person object with $firstName $lastName\n")
    }
    // secondary constructor
    constructor(firstName: String,lastName: String,age: Int)
            : this(firstName,lastName){
        this.age = age
            }
    fun stateHobby(){
        // firstName parameter couldnt be used in this block as it is not a member variable
        // we have to initialize and assign it to a member variable (FirstName) to ise it
        println("$FirstName\'s hobby is $hobby")
    }
}

class MobilePhone(osName: String, brand: String, model: String){

    init{
        print("Your new $osName phone is $brand $model")
    }

}
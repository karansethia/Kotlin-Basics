package com.example.kotlinbasics

open class car(val name: String,val brand: String){

	open var range : Double = 0.0  // making a property open can let other child classes override its original properties

	fun extendRange(amount: Double){
		if(amount > 0){
			range+=amount
		}
	}
	fun drive(distance: Double){
		println("the distance travelled by this car is $distance")
	}
}
open class ElectricCar(name: String, brand: String, batteryLife: Double) : car(name, brand){  // parameters of child class and parent class must be same while inheriting
	override var range: Double = batteryLife *5
//		get() = super.range
//		set(value) {}   -> overriding using getters and setters
}

fun main(){
	var PaganiHuayra = car("Huayra","Pagani")
	var TeslaS = ElectricCar("S","Tesla", 85.0)
	PaganiHuayra.drive(120.0)
	TeslaS.drive(90.0)
	TeslaS.extendRange(144.0)
	println(TeslaS.range)
}
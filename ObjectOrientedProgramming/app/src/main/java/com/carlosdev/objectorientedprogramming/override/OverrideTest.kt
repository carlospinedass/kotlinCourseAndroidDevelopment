package com.carlosdev.objectorientedprogramming.override

fun main(args: Array<String>) {
    // Creating an object from Vehicle class
    var vehicle = Vehicle();
    vehicle.start()
    vehicle.accelerate(80)
    vehicle.stop()

    println("---------------------------------")

    // creating an object from a car
    var car = Car()
    car.start()
    car.accelerate(100)
    car.stop()

    println("---------------------------------")
    car.superStart()
    car.superAccelerate()
    car.superStop()
}
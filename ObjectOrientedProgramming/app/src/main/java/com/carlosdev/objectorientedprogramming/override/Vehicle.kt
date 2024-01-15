package com.carlosdev.objectorientedprogramming.override

open class Vehicle {

    // Si vamos a necesitar hacer override a los métodos necesitamos hacerlos open para poder
    // editarlos
    open fun start() {
        println("Car has started")
    }

    open fun accelerate(speed:Int) {
        println("Car accelerates at $speed")
    }

    open fun stop() {
        println("Car has stopped.")
    }
}
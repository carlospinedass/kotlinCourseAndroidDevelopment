package com.carlosdev.objectorientedprogramming

fun main(args: Array<String>) {
    var myCar = Cars()
    myCar.name = "Ferrari"
    myCar.model = 2021

    var myCar2 = Cars()
    myCar.name = "Mercedes"
    myCar.model = 2010

    println("My first car's name is ${myCar.name} and its model is ${myCar.model}")
    println("My second car's name is ${myCar2.name} and its model is ${myCar2.model}")
}
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

    var myNewCar = MyCars("Ferrari", 2021);

    println("My new car's name is ${myNewCar.name} and its model is ${myNewCar.model}")

    // Podemos definir por medio de sobrecarga la cantidad de parámetros que queremos que tenga el
    // constructor de esta forma podemos definir de diferente manera el objeto
    var mySecondCars = MySecondCars();

    var mySecondCarsOverload = MySecondCars("Ford", 2010)

    mySecondCarsOverload.name = "Toyota"
//    mySecondCarsOverload.model = 2001 // Tenemos el proceso de settear privado por lo que cuando
    // intentamos cambiar el valor no lo permite

    println("My second car's name is ${mySecondCarsOverload.name} and its model is ${mySecondCarsOverload.model}")
}
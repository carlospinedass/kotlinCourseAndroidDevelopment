package com.carlosdev.objectorientedprogramming

// Constructor principal
class MyCars constructor(var name: String, var model: Int) {
    // Constructor principal
    // La función init nos ayuda a realizar una acción específica al iniciar el constructor
    init {
        println("My car's name is $name and its model is $model")
    }
}
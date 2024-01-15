package com.carlosdev.objectorientedprogramming.interfaces

class Vehicles: CanGo, CanStop {
    override fun stop() {
        TODO("Not yet implemented")
    }

    override val name: String
        get() = "Ferrari"
}
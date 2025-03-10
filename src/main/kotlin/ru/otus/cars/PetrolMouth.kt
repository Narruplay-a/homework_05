package ru.otus.cars

class PetrolMouth(override val tank: Tank): TankMouth() {
    fun fuelPetrol(litres: Int) {
        tank.receiveFuel(litres)
    }

    override fun open() {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }
}
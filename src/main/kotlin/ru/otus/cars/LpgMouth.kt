package ru.otus.cars

class LpgMouth(override val tank: Tank): TankMouth() {
    fun fuelLpg(litres: Int) {
        tank.receiveFuel(litres)
    }

    override fun open() {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }
}

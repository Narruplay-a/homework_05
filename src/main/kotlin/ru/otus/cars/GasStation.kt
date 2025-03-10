package ru.otus.cars

class GasStation {
    fun addFuel(car: Car, fuel: Int) {
        try {
            if (car.tankMouth is LpgMouth) {
                (car.tankMouth as LpgMouth).fuelLpg(fuel)
            } else {
                (car.tankMouth as PetrolMouth).fuelPetrol(fuel)
            }
        } catch (e: NotImplementedError) {
            println(e.message)
        }
    }

    fun addFuel(cars: List<Car>) {
        cars.forEach { println(it.toString()) }
        cars.forEach { this.addFuel(it, 100) }
        cars.forEach { println(it.toString()) }
    }
}
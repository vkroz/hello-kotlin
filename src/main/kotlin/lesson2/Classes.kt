package lesson2

abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean {
        return residents < capacity
    }
}

class SquareCabin(residents: Int) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6
}

class RoundHut(residents: Int) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity: Int
        get() = 3

}

//class RoundTower : RoundHut() {
//
//}


fun main(args: Array<String>) {
    val dwelling = SquareCabin(3)
    println("\nSquare Cabin\n========")
    println("Capacity=${dwelling.capacity}")
    println("Material=${dwelling.buildingMaterial}")
    println("Has room?=${dwelling.hasRoom()}")

    val dwelling2 = RoundHut(3)
    println("\nRound Hut\n========")
    println("Capacity=${dwelling2.capacity}")
    println("Material=${dwelling2.buildingMaterial}")
    println("Has room?=${dwelling2.hasRoom()}")

}



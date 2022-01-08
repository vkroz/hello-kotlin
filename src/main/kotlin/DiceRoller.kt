object DiceRoller {
    @JvmStatic
    fun main(args: Array<String>) {
        val dice1 = Dice(6)
        println("Dice1 has ${dice1.numSides}, rolled: ${dice1.roll()}")
        val dice2 = Dice(10)
        println("Dice2 has ${dice2.numSides}, rolled: ${dice2.roll()}")
    }
}

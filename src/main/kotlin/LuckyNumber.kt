object LuckyNumber {
    @JvmStatic
    fun main(args: Array<String>) {
        val dice = Dice(6)
        val luckyNumber = dice.roll()
        val secondRoll = dice.roll()

        when(secondRoll) {
            luckyNumber -> println("You won!!!")
            1 -> println("You rolled 1, but lucky number is ${luckyNumber}")
            2 -> println("You rolled 2, but lucky number is ${luckyNumber}")
            3 -> println("You rolled 3, but lucky number is ${luckyNumber}")
            4 -> println("You rolled 4, but lucky number is ${luckyNumber}")
            5 -> println("You rolled 5, but lucky number is ${luckyNumber}")
            6 -> println("You rolled 6, but lucky number is ${luckyNumber}")
        }
    }
}


// Simplest if/else
object LuckyNumber2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val dice = Dice(6)
        val firstRoll = dice.roll()
        val secondRoll = dice.roll()

        if (firstRoll == secondRoll) print("Match! ${firstRoll} == ${secondRoll}")
        else print("No Match :( ${firstRoll} == ${secondRoll}")
    }
}


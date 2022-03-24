class Hand {
    val dice = mutableListOf<Die>()
    val lockedDice = mutableListOf<Die>()

    constructor() {
        for (i in 1..6){
            val die = Die((1))
            dice.add(die)
        }
    }

    fun roll(numOfDice:Int){
        dice.clear()
        for (i in 1..numOfDice){
            val die = Die((1..6).random())
            dice.add(die)
        }
    }
}
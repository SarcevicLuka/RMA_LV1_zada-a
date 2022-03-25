class ResultChecker (val diceHandler:DiceHandler){

    private fun isPoker(dice:MutableList<Int>){
        val pokerMap = dice.groupingBy { it }.eachCount().filter { it.value == 4 }
        println(pokerMap.isNotEmpty())
        if(pokerMap.isNotEmpty()) {
            println("You got a poker!")
        }
    }

    private fun isYahtzee(dice:MutableList<Int>){
        val yahtzeeMap = dice.groupingBy { it }.eachCount().filter { it.value == 5 }
        if(yahtzeeMap.isNotEmpty()) {
            println("You got a yahtzee!")
        }
    }

    private fun isDoublePair(dice:MutableList<Int>){
        val pairMap = dice.groupingBy { it }.eachCount().filter { it.value == 2 }
        if(pairMap.count() >= 2){
            println("You got two pairs")
        }
    }

    fun checkResults(hand:Hand){
        var dice = mutableListOf<Int>()
        dice = diceHandler.makeDiceList(hand)
        isPoker(dice)
        isYahtzee(dice)
        isDoublePair(dice)
    }
}
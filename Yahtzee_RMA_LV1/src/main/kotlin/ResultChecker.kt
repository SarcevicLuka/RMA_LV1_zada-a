class ResultChecker {

    private fun isPoker(hand:Hand){
        val pokerMap = hand.lockedDice.groupingBy { it }.eachCount().filter { it.value >= 4 }
        println(pokerMap.isNotEmpty())
        if(pokerMap.isNotEmpty()) {
            println("You got a poker!")
        }
    }

    private fun isYahtzee(hand:Hand){
        val yahtzeeMap = hand.lockedDice.groupingBy { it }.eachCount().filter { it.value >= 5 }
        if(yahtzeeMap.isNotEmpty()) {
            println("You got a yahtzee!")
        }
    }

    fun checkResults(hand:Hand){
        isPoker(hand)
        isYahtzee(hand)
    }
}
fun main() {

    val hand = Hand()
    val gameUI = GameUI()
    val diceHandler = DiceHandler(hand)
    val resultChecker = ResultChecker()
    /*val die = Die(1)
    val pokerHand = Hand()
    pokerHand.lockedDice.add(die)
    pokerHand.lockedDice.add(die)
    pokerHand.lockedDice.add(die)
    pokerHand.lockedDice.add(die)

    val pokerMap = pokerHand.lockedDice.groupingBy { it }.eachCount().filter { it.value >= 4 }

    println(pokerMap.isNotEmpty())
    pokerHand.lockedDice.clear()*/

    val round = Round(hand, gameUI, diceHandler, null, 0)
    round.firstThrow()
    round.secondThrow()
    round.thirdThrow()

    gameUI.printLockedDice(hand.lockedDice)
    resultChecker.checkResults(hand)
    println("Round finished")
}



fun main() {

    val hand = Hand()
    val gameUI = GameUI()
    val diceHandler = DiceHandler(hand)
    val resultChecker = ResultChecker(diceHandler)
    val round = Round(hand, gameUI, diceHandler, null, 0)

    round.firstThrow()
    round.secondThrow()
    round.thirdThrow()

    resultChecker.checkResults(hand)
    println("Round finished")
}

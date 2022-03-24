class Round(
    private var hand:Hand,
    private var gameUI:GameUI,
    private var diceHandler:DiceHandler,
    var indexes:String?,
    var numOfDiceToRoll:Int = 0
){

    fun firstThrow(){
        println("1st roll!")

        hand.roll(6)
        gameUI.printDice(hand.dice)
        println()
        gameUI.printLockedDiceMessage()

        indexes = gameUI.recvDiceIndexes()

        if(indexes.equals("Skip")){
            gameUI.printSkippedThrowMessage()
        }
        else if (indexes != null) {
            diceHandler.lockDice(indexes!!)
            gameUI.printLockedDice(hand.lockedDice)
        }
        println()
    }

    fun secondThrow() {
        println("2nd roll!")
        gameUI.printUnlockDiceMessage()

        indexes = gameUI.recvDiceIndexes()

        if (indexes.equals("Skip")) {
            gameUI.printSkipLockedDiceMessage()
        }
        else if (indexes != null) {
            diceHandler.unlockDice(indexes!!)
            gameUI.printLockedDice(hand.lockedDice)
        }
        println()
        println("Rolled dice")

        numOfDiceToRoll = hand.lockedDice.count()
        hand.roll(6 - numOfDiceToRoll)
        gameUI.printDice(hand.dice)
        println()
        gameUI.printLockedDiceMessage()

        indexes = gameUI.recvDiceIndexes()

        if (indexes.equals("Skip")) {
            gameUI.printSkippedThrowMessage()
        }
        else if (indexes != null) {
            diceHandler.lockDice(indexes!!)
            gameUI.printLockedDice(hand.lockedDice)
        }
    }

    fun thirdThrow(){
        println("3rd roll!")

        gameUI.printUnlockDiceMessage()
        indexes = gameUI.recvDiceIndexes()

        if(indexes.equals("Skip")){
            gameUI.printSkipLockedDiceMessage()
        }
        else if (indexes != null) {
            diceHandler.unlockDice(indexes!!)
            gameUI.printLockedDice(hand.lockedDice)
        }

        println()
        println("Rolled dice")



        numOfDiceToRoll = hand.lockedDice.count()
        hand.roll(6 - numOfDiceToRoll)
        gameUI.printDice(hand.dice)
        println()
        gameUI.printUnlockDiceMessage()

        indexes = gameUI.recvDiceIndexes()

        if(indexes.equals("Skip")){
            gameUI.printSkippedThrowMessage()
        }
        else if (indexes != null) {
            diceHandler.lockDice(indexes!!)
            gameUI.printLockedDice(hand.lockedDice)
        }
    }

}
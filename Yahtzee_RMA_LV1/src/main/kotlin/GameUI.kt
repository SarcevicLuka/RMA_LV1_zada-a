class GameUI {

    fun printDice(dice: MutableList<Die>){
        for (die in dice){
            print("|${die.value}| ")
        }
    }

    fun printLockedDice(lockedDice: MutableList<Die>){
        println("Locked dice:")
        for (die in lockedDice){
            print("|${die.value}| ")
        }
    }

    fun printLockedDiceMessage(){
        println("Enter indexes of dice you want to keep. (From 1 to 6) | If you want to roll all of them type 'Skip'")
    }

    fun printUnlockDiceMessage(){
        println("If you want to remove dice from being locked choose an index which you want to remove! If not type 'Skip'")
    }

    fun printSkipLockedDiceMessage(){
        println("You skipped removing locked dice")
    }

    fun printSkippedThrowMessage(){
        println("You skipped a throw")
    }

    fun recvDiceIndexes():String?{
        var index = readLine()
        if(index.equals("Skip")) return index

        return index?.filter { it.isDigit() }
    }
}
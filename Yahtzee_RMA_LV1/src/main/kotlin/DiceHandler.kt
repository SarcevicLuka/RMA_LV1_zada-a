class DiceHandler (private val hand:Hand){

    fun lockDice(indexes:String){
        for (index in indexes) {
            hand.lockedDice.add(hand.dice[index.digitToInt() - 1])
        }
    }

    fun unlockDice(indexes:String){
        for (index in indexes) {
            hand.lockedDice.removeAt(index.digitToInt() - 1)
        }
    }
}
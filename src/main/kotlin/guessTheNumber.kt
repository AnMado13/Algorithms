import Helper.generatePossibleNumbers
import Helper.requestAnswer

fun main() {
    val possibleNumbers = generatePossibleNumbers()

    var leftIndex = -1
    var rightIndex = possibleNumbers.size - 1

    while (leftIndex + 1 < rightIndex) {
        val candidateIndex = (leftIndex + rightIndex) / 2
        val answer = requestAnswer(possibleNumbers[candidateIndex])

        if (answer == "<"){
            rightIndex = candidateIndex
        } else {
            leftIndex = candidateIndex
        }
    }

}

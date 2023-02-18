package binarySearch

import binarySearch.extensions.BinarySearches.binaryGuess
import binarySearch.extensions.Helper.getPossibleNumbers

fun main() {
    val possibleNumbers = getPossibleNumbers()
    val answer = binaryGuess(possibleNumbers)

    println("!$answer")
}

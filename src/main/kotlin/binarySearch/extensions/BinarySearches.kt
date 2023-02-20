package binarySearch.extensions

import binarySearch.extensions.Helper.requestAnswer
import kotlin.math.abs

object BinarySearches {
    private fun binarySearchRight(
        searchElement: Int,
        list: List<Int>
    ): Int {
        var leftIndex = -1
        var rightIndex = list.size - 1

        do {
            val possibleIndex = (leftIndex + rightIndex) / 2

            if (searchElement > list[possibleIndex]){
                leftIndex = possibleIndex
            } else {
                rightIndex = possibleIndex
            }
        } while (leftIndex + 1 < rightIndex)

        return rightIndex
    }

    private fun binarySearchLeft(list: List<Int>): Int {
        var leftIndex = 0
        var rightIndex = list.size

        do {
            val possibleIndex = (leftIndex + rightIndex) / 2

            if (requestAnswer(list[possibleIndex]) == "<"){
                rightIndex = possibleIndex
            } else {
                leftIndex = possibleIndex
            }

        } while (leftIndex + 1 < rightIndex)

        return leftIndex
    }

    fun binarySearchWithAnswer(
        searchElement: Int,
        list: List<Int>
    ): String {
        val searchIndex = binarySearchRight(searchElement, list)

        return if (searchElement == list[searchIndex]){
            "YES"
        }
        else {
            "NO"
        }
    }

    fun binaryClosestSearch(
        searchElement: Int,
        list: List<Int>
    ): Int {
        val possibleIndex = binarySearchRight(searchElement, list)
        val closestRight = list[possibleIndex]
        val closestLeft = if (possibleIndex > 0) list[possibleIndex - 1] else closestRight

        return if (searchElement - closestLeft <= abs(closestRight - searchElement)){
            closestLeft
        } else{
            closestRight
        }
    }
    fun binaryGuess(possibleNumbers: List<Int>): Int {
        val answerIndex = binarySearchLeft(list = possibleNumbers)

        return possibleNumbers[answerIndex]
    }

    fun binaryRealSearch(
        startLeft: Double,
        startRight: Double,
        error: Double,
        function: (argument: Double) -> Double
    ): Double{
        var leftBorder = startLeft
        var rightBorder = startRight

        while (rightBorder - leftBorder > error){
            val middlePoint = (leftBorder + rightBorder) / 2
            if (function(rightBorder) * function(middlePoint) > 0) {
                rightBorder = middlePoint
            } else {
                leftBorder = middlePoint
            }
        }

        return rightBorder
    }
}
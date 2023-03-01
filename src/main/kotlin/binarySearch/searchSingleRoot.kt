package binarySearch

import binarySearch.extensions.BinarySearches.binaryRealSearch
import binarySearch.extensions.Helper.searchRootIntervalForFunction
import getInput

fun main(){
    val epsilon = 0.00001
    val coeffs = getInput()
    val cubicFunction = { x: Double -> coeffs[0] * x * x * x + coeffs[1] * x * x + coeffs[2] * x + coeffs[3] }

    val rootInterval = searchRootIntervalForFunction(cubicFunction)
    val root = binaryRealSearch(
        startLeft = -rootInterval,
        startRight = rootInterval,
        error = epsilon,
        function = cubicFunction
    )

    println(root)
}
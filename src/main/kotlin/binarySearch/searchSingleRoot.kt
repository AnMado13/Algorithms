package binarySearch

import binarySearch.extensions.BinarySearches.binaryRealSearch
import binarySearch.extensions.Helper.getInput
import binarySearch.extensions.Helper.searchRootIntervalForFunction

fun main(){
    val error = 0.00001
    val coeffs = getInput()
    val function = { x: Double -> coeffs[0] * x * x * x + coeffs[1] * x * x + coeffs[2] * x + coeffs[3] }

    val rootInterval = searchRootIntervalForFunction(function)
    val root = binaryRealSearch(rootInterval, error, function)

    println(root)
}
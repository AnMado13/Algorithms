package binarySearch

import binarySearch.extensions.BinarySearches.binaryClosestSearch
import getInput

fun main(){
    readln()
    val firstList = getInput()
    val secondList = getInput()

    for (element in secondList){
        println(binaryClosestSearch(
            searchElement = element,
            list = firstList
            )
        )
    }
}
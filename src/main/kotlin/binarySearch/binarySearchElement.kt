package binarySearch

import binarySearch.extensions.BinarySearches.binarySearchWithAnswer
import binarySearch.extensions.Helper.getInput

fun main(){
    readln() //Нам не обязательно отдельно узнавать размеры списков
    val firstList = getInput()
    val secondList = getInput()

    for (element in secondList){
        println(binarySearchWithAnswer(
            searchElement = element,
            list = firstList
            )
        )
    }
}
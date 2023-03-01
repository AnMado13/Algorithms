package sort

import getInput
import sort.Sorts.mergeSort

fun main() {
    readln()
    val list = getInput()
    val (sortedList, inversions) = list.mergeSort()
    println("$inversions\n$sortedList")
}

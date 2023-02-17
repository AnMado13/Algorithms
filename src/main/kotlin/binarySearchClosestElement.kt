import Helper.binaryClosestSearch
import Helper.getInput

fun main(){
    readln()
    val firstList = getInput()
    val secondList = getInput()

    for (element in secondList){
        println(binaryClosestSearch(element, firstList))
    }
}
import Helper.binarySearchWithAnswer
import Helper.getInput

fun main(){
    val separator = " "

    readln() //Нам не обязательно отдельно узнавать размеры списков
    val firstList = getInput(separator)
    val secondList = getInput(separator)

    for (element in secondList){
        println(binarySearchWithAnswer(element, firstList))
    }
}
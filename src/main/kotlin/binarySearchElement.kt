import Helper.binarySearchWithAnswer
import Helper.getInput

fun main(){
    readln() //Нам не обязательно отдельно узнавать размеры списков
    val firstList = getInput()
    val secondList = getInput()

    for (element in secondList){
        println(binarySearchWithAnswer(element, firstList))
    }
}
private fun getInput(separator: String): List<Int> {
    return readln().split(separator).map{ it.toInt() }
}

private fun binarySearch(searchElement: Int, list: List<Int>): String {
    var leftIndex = -1
    var rightIndex = list.size - 1

    do {
        val searchIndex = (leftIndex + rightIndex) / 2

        if (searchElement > list[searchIndex]){
            leftIndex = searchIndex
        } else {
            rightIndex = searchIndex
        }
    } while (leftIndex + 1 < rightIndex)

    return if (searchElement == list[rightIndex]){
        "YES"
    }
    else{
        "NO"
    }
}

fun main(){
    val separator = " "

    readln() //Нам не обязательно отдельно узнавать размеры списков
    val firstList = getInput(separator)
    val secondList = getInput(separator)

    for (element in secondList){
        println(binarySearch(element, firstList))
    }
}
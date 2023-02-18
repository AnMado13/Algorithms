package binarySearch.extensions

object Helper {
    fun getInput(separator: String = " "): List<Int> {
        return readln().split(separator).map{ it.toInt() }
    }

    fun getPossibleNumbers(): List<Int>{
        val listSize = readln().toInt()

        return (1..listSize).toList()
    }
    fun requestAnswer(number: Number): String{
        println(number)
        System.out.flush()

        return readln()
    }
}
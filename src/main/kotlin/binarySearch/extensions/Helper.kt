package binarySearch.extensions

object Helper {
    fun getPossibleNumbers(): List<Int>{
        val listSize = readln().toInt()

        return (1..listSize).toList()
    }
    fun requestAnswer(number: Number): String{
        println(number)
        System.out.flush()

        return readln()
    }

    fun searchRootIntervalForFunction(function: (argument: Double) -> Double): Double {
        var radius = 1.0

        while (function(radius) * function(-radius) > 0){
            radius += 1
        }
        return radius
    }
}
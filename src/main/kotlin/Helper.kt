import kotlin.math.abs

object Helper {
    fun getInput(separator: String = " "): List<Int> {
        return readln().split(separator).map{ it.toInt() }
    }

    fun requestAnswer(number: Number): String{
        println(number)
        System.out.flush()

        return readln()
    }

    fun generatePossibleNumbers(): List<Int>{
        val listSize = readln().toInt()

        return (1..listSize).toList()
    }

    private fun binarySearch(searchElement: Int, list: List<Int>): Int {
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

        return rightIndex
    }

    fun binarySearchWithAnswer(searchElement: Int, list: List<Int>): String {
        val searchIndex = binarySearch(searchElement, list)

        return if (searchElement == list[searchIndex]){
            "YES"
        }
        else {
            "NO"
        }
    }

    fun binaryClosestSearch(searchElement: Int, list: List<Int>): Int {
        val expectedIndex = binarySearch(searchElement, list)
        val closestRight = list[expectedIndex]
        val closestLeft = if (expectedIndex > 0) list[expectedIndex - 1] else closestRight

        return if (searchElement - closestLeft <= abs(closestRight - searchElement)){
            closestLeft
        } else{
            closestRight
        }
    }
}
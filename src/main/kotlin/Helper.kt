object Helper {
    fun getInput(separator: String): List<Int> {
        return readln().split(separator).map{ it.toInt() }
    }

    fun binarySearch(searchElement: Int, list: List<Int>): Int {
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
}
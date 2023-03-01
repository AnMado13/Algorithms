package sort

object Sorts {
    fun List<Int>.stringOfElements(): String{
        var result = ""

        for (element in this){
            result += "$element "
        }

        return result
    }

    // возвращает отсортированный список и количество инверсий в исходном: i < j, a_i > a_j
    fun List<Int>.mergeSort(): Pair<List<Int>, Long> {

        //выход из рекурсии
        if (this.size == 1){
            return Pair(this, 0)
        }

        //делим сортируемый массив пополам и сортируем половинки
        val (leftPart, leftInversions) = this.subList(0, this.size / 2).mergeSort()
        val (rightPart, rightInversions)  = this.subList(this.size / 2, this.size).mergeSort()
        val mergedList = mutableListOf<Int>()

        var inversions = leftInversions + rightInversions

        //делаем слияние половинок, элементы правого списка вливаю в левый список
        var leftPartHead = 0
        var rightPartHead = 0

        while (mergedList.size < this.size) {
            if (leftPartHead == leftPart.size){
                mergedList.add(rightPart[rightPartHead++])
            } else if (rightPartHead == rightPart.size) {
                mergedList.add(leftPart[leftPartHead++])
            }
            else if (leftPart[leftPartHead] <= rightPart[rightPartHead]) {
                mergedList.add(leftPart[leftPartHead++])
            } else{
                inversions += rightPart.size - rightPartHead
                mergedList.add(rightPart[rightPartHead++])
            }
        }

        return Pair(mergedList, inversions)
    }
}
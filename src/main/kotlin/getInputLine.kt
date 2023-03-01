fun getInput(separator: String = " "): List<Int> {
    return readln().split(separator).map{ it.toInt() }
}


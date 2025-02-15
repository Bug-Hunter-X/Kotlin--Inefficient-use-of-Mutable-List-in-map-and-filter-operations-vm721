fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Using immutable list is more efficient

    val oddNumbers = list.filter { it % 2 != 0 }
    println(oddNumbers) //Using immutable list is more efficient
}
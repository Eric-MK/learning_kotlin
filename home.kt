fun main() {
    val nestedList = listOf(listOf(1, 2, 3), listOf(4, 5), listOf(6, 7, 8))

    // Use the 'flatten' function to flatten the nested list
    val flatList = nestedList.flatten()

    println("Nested List: $nestedList")
    println("Flat List: $flatList")
}

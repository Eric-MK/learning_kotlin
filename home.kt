fun main() {
    // Zipping two lists
    val list1 = listOf("A", "B", "C")
    val list2 = listOf(1, 2, 3)
    val zipped = list1.zip(list2)
    println("Zipped: $zipped")

    // Associating elements from two lists
    val keys = listOf("A", "B", "C")
    val values = listOf(1, 2, 3)
    val association = keys.associateWith { values[keys.indexOf(it)] }
    println("Association: $association")
}

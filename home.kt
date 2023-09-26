fun main() {
    // List
    val myList = listOf(1, 2, 3, 2, 4)
    println("List: $myList")

    // Set
    val mySet = setOf(1, 2, 3, 2, 4)
    println("Set: $mySet")

    // Map
    val myMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    println("Map: $myMap")

    // Accessing elements in a map
    val value = myMap["two"]
    println("Value associated with 'two': $value")
}

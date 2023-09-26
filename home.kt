fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Example 1: Squaring each number
    val squaredNumbers = numbers.map { it * it }

    // Example 2: Doubling each number
    val doubledNumbers = numbers.map { it * 2 }

    // Example 3: Converting numbers to strings
    val numberStrings = numbers.map { it.toString() }

    // Example 4: Mapping to custom objects
    data class Person(val name: String, val age: Int)
    val people = numbers.map { Person("Person-$it", it * 10) }

    // Example 5: Applying a more complex transformation
    val customMapping = numbers.map {
        if (it % 2 == 0) {
            "Even"
        } else {
            "Odd"
        }
    }

    // Printing the results
    println("Original Numbers: $numbers")
    println("Squared Numbers: $squaredNumbers")
    println("Doubled Numbers: $doubledNumbers")
    println("Number Strings: $numberStrings")
    println("People: $people")
    println("Custom Mapping: $customMapping")
}

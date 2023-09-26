fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Using 'filter' to keep only even numbers
    val evenNumbers = numbers.filter { it % 2 == 0 }

    println("Original Numbers: $numbers")
    println("Even Numbers: $evenNumbers")
}


fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // Retrieve a sublist of elements at indices 2, 3, and 4
    val sublist = numbers.slice(2..4)
    
    val numberss = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // Partition into even and odd numbers
    val (evenNumbers, oddNumbers) = numberss.partition { it % 2 == 0 } //the first list contains elements that match the predicate, and the second list contains elements that do not.

    }


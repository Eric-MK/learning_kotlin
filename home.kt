fun main() {
/*     Array: This represents a fixed-size array where the size is defined at the time of creation and cannot be changed.
 */// Define an array of integers with a size of 5
val numbers = arrayOf(1, 2, 3, 4, 5, "name")

// Access elements by index
val firstNumber = numbers[0]  // Access the first element (index 0)
val secondNumber = numbers[1] // Access the second element (index 1)

// Get the size of the array
val size = numbers.size

// Loop through the array
for (number in numbers) {
    println(number)
}

}




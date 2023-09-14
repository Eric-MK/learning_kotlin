fun main() {
    var outer = 1  // Initialize the outer loop counter

    // Start the outer loop
    while (outer <= 3) {  // Continue as long as outer is less than or equal to 3
        var inner = 1  // Initialize the inner loop counter

        // Start the inner loop
        while (inner <= 3) {  // Continue as long as inner is less than or equal to 3
            // Print a message that includes the current values of outer and inner
            println("Outer: $outer, Inner: $inner")

            inner++  // Increment the inner loop counter
        }
        // End of the inner loop

        outer++  // Increment the outer loop counter
    }
    // End of the outer loop
}

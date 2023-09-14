fun main(args: Array<String>) {
  // Define an outer loop labeled as "loop"
loop@ for (i in 1..3) {
    println("Outer loop: $i")  // Print the value of i for the outer loop
    for (j in 1..3) {
        if (i == 2 && j == 2) {
            break@loop // Breaks out of the outer loop labeled as "loop"
        }
        println("Inner loop: $j")  // Print the value of j for the inner loop
    }
}  
}




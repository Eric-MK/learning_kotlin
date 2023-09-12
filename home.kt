fun main() {
    val byteValue: Byte = 100
    val shortValue: Short = 30000

    println("Byte Value: $byteValue")
    println("Short Value: $shortValue")

    val sum = byteValue + shortValue  // This is allowed, but you'll get a result of type Int.
    println("Sum: $sum")
}

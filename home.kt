class Person(
    val firstName: String = "John",
    val lastName: String = "Doe",
    val age: Int = 30
) {
    val fullName = "$firstName $lastName"
}

fun main() {
    // Creating instances with different sets of parameters
    val person1 = Person()
    val person2 = Person("Alice")
    val person3 = Person("Bob", "Smith", 25)

    // Printing the properties
    println(person1.fullName) // Output: "John Doe"
    println(person2.fullName) // Output: "Alice Doe"
    println(person3.fullName) // Output: "Bob Smith"
}

class Person {
    val fullName: String

    constructor(firstName: String, lastName: String) {
        fullName = "$firstName $lastName"
    }

    constructor(name: String) {
        fullName = name
    }

    // Other methods and properties...
}


fun main() {
    val person1 = Person("John", "Doe")
val person2 = Person("Alice Johnson")

println(person1.fullName) // Output: "John Doe"
println(person2.fullName) // Output: "Alice Johnson"

}

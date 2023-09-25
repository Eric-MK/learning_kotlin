// Define a data class called 'Person' with properties
data class Person(val name: String, val age: Int)

fun main() {
    // Create instances of the 'Person' data class
    val person1 = Person("Alice", 30)
    val person2 = Person("Bob", 25)

    // Automatically generated methods:
    // - equals() compares objects based on property values
    println("Are person1 and person2 equal? ${person1 == person2}")

    // - hashCode() generates a hash code based on property values
    println("Hash code of person1: ${person1.hashCode()}")

    // - toString() provides a string representation of the object
    println("Person1: $person1")

    // - component functions allow destructuring
    val (name, age) = person1
    println("Destructured: Name=$name, Age=$age")

    // Create a copy of 'person1' with a modified age
    val olderPerson = person1.copy(age = 35)
    println("Older person: $olderPerson")
}

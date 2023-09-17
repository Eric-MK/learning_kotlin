fun main() {
    val person = Person("John", "Doe")
    println(person.fullName) // Prints "John Doe"
    
}

class Person(firstName: String, lastName: String) {
    val fullName: String

    init {
        fullName = "$firstName $lastName"
    }
}



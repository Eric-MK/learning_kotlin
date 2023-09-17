class Person(val name: String) {
    companion object {
        const val DEFAULT_NAME = "Unknown" // A constant property
        fun createDefaultPerson() = Person(DEFAULT_NAME) // A factory method
    }
}

fun main() {
    // Accessing a constant property from the companion object
    println("Default Name: ${Person.DEFAULT_NAME}")

    // Using a factory method from the companion object to create a Person instance
    val defaultPerson = Person.createDefaultPerson()
    println("Default Person Name: ${defaultPerson.name}")
}

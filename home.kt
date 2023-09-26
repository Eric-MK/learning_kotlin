fun main() {
    // Define an object expression inside a function In object-oriented programming (OOP), an object expression is a way to create an anonymous object or instance of a class without explicitly defining a named class.
    val person = object {
        val name = "Alice"
        val age = 30

        fun greet() {
            println("Hello, my name is $name and I'm $age years old.")
        }
    }

    // Access properties and call methods of the anonymous object
    println(person.name) // Output: Alice
    person.greet()       // Output: Hello, my name is Alice and I'm 30 years old.
}

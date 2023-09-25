// Define a superclass called 'Animal' The open keyword indicates that this class can be subclassed (extended) by other classes, allowing for inheritance and method overriding.
open class Animal(val name: String) {
    // Property and method of the superclass
    open fun makeSound() {
        println("$name makes a sound")
    }
}

// Define a subclass called 'Dog' that inherits from 'Animal'
class Dog(name: String) : Animal(name) {
    // Additional property of the subclass
    val breed: String = "Unknown"

    // Override the 'makeSound' method to provide a specific behavior for dogs
    override fun makeSound() {
        println("$name (a $breed dog) barks loudly")
    }
}

fun main() {
    // Create instances of the superclass and subclass
    val genericAnimal = Animal("Generic Animal")
    val myDog = Dog("Buddy")

    // Call methods on both objects
    genericAnimal.makeSound() // Output: Generic Animal makes a sound
    myDog.makeSound()         // Output: Buddy (a Unknown dog) barks loudly
}

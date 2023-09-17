class Person {
    // Declare an age property with an initial value of 0
    var age: Int = 0
        // Custom getter
        get() {
            println("Getting age")
            return field // 'field' refers to the actual property value
        }
        // Custom setter
        set(value) {
            println("Setting age to $value")
            field = value // 'field' allows you to assign the value to the property
        }
}

fun main() {
    // Create an instance of the Person class
    val person = Person()
    
    // Access the age property (calls custom getter)
    val currentAge = person.age
    println("Current age: $currentAge") // Output: "Getting age\nCurrent age: 0"
    
    // Modify the age property (calls custom setter)
    person.age = 30
    println("Updated age: ${person.age}") // Output: "Setting age to 30\nGetting age\nUpdated age: 30"
}

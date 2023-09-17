class MyClass {
    // Declare a lateinit property
    lateinit var name: String

    // Function to initialize the property
    fun initializeName() {
        name = "John"
    }

    // Function to use the property
    fun printName() {
        if (this::name.isInitialized) {
            println("Name: $name")
        } else {
            println("Name is not initialized yet")
        }
    }
}

fun main() {
    val myObject = MyClass()

    // Accessing the property before initialization would result in an exception
    // Uncommenting the next line would result in a 'lateinit' property access exception
    // println(myObject.name)

    // Initialize the property
    myObject.initializeName()

    // Access and print the property
    myObject.printName()
}

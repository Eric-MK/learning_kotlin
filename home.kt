// Define a Singleton class called MySingleton
object MySingleton {
    // Private nullable variable to hold the Singleton instance
    private var instance: MySingleton? = null

    // Function to get the Singleton instance
    fun getInstance(): MySingleton {
        // If the instance is not created, create it
        if (instance == null) {
            instance = MySingleton
        }
        // Return the Singleton instance
        return instance!!
    }

    // Function to demonstrate a method of the Singleton
    fun doSomething() {
        println("Singleton is doing something")
    }
}

// Entry point of the program
fun main() {
    // Get the Singleton instance using the getInstance() method
    val singleton1 = MySingleton.getInstance()
    val singleton2 = MySingleton.getInstance()

    // Check if both references point to the same instance
    println(singleton1 === singleton2) // Output: true (both references are the same)

    // Call a method of the Singleton
    singleton1.doSomething()
}

// Define an outer class called OuterClass
class OuterClass(private val outerProperty: Int) {

    // Define an outer function
    fun outerFunction() {
        println("Outer function called")
    }

    // Define an inner class called InnerClass
    inner class InnerClass(private val innerProperty: Int) {
        // Define an inner function
        fun innerFunction() {
            println("Inner function called with innerProperty=$innerProperty")
            
            // Access the outerProperty from the outer class
            println("Accessing outerProperty from inner class: $outerProperty")
            
            // Call the outerFunction from the outer class
            outerFunction()
        }
    }
}

fun main() {
    // Create an instance of the OuterClass with an outerProperty of 42
    val outer = OuterClass(42)
    
    // Create an instance of the InnerClass using the outer instance
    val inner = outer.InnerClass(10)

    // Call the innerFunction, which will access both inner and outer properties/functions
    inner.innerFunction()
}

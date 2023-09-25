// Define an abstract class called 'Shape'
abstract class Shape {
    // Abstract method to calculate area (no implementation)
    abstract fun calculateArea(): Double

    // Concrete method to display information
    fun displayInfo() {
        println("This is a shape.")
    }
}

// Define a subclass 'Circle' that inherits from 'Shape'
class Circle(private val radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return 3.14 * radius * radius
    }
}

// Define another subclass 'Rectangle' that inherits from 'Shape'
class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun calculateArea(): Double {
        return width * height
    }
}

// Define an interface called 'Drawable'
interface Drawable {
    // Abstract method signature for drawing
    fun draw()
}

// Implement the 'Drawable' interface in a class
class Circle : Drawable {
    override fun draw() {
        println("Drawing a circle")
    }
}

class Square : Drawable {
    override fun draw() {
        println("Drawing a square")
    }
}

fun main() {
    val circle = Circle()
    val square = Square()

    // Polymorphism: Both 'circle' and 'square' can be treated as 'Drawable'
    val shapes: List<Drawable> = listOf(circle, square)

    for (shape in shapes) {
        shape.draw() // Calls the 'draw' method of each object
    }
}

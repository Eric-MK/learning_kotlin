// Define a function with two parameters and a return type
fun add(a: Int, b: Int): Int {
    // Function body - performs addition
    return a + b
}

// Call the function and store the result in a variable
val sum = add(5, 3) // sum = 8

// Define a function with a default argument
fun greet(name: String = "Guest") {
    // Function body - greets with a name (default is "Guest")
    println("Hello, $name!")
}

// Call the greet function with and without specifying a name
greet()         // Outputs: Hello, Guest!
greet("Alice")  // Outputs: Hello, Alice!

// Define a function with named arguments
fun printCoordinates(x: Int, y: Int) {
    // Function body - prints coordinates
    println("x: $x, y: $y")
}

// Call the function using named arguments
printCoordinates(y = 5, x = 10)  // Outputs: x: 10, y: 5

// Define a function as an expression with if-else
fun max(a: Int, b: Int): Int {
    // Function body - returns the maximum of two numbers
    return if (a > b) a else b
}

// Define the same function as a concise expression
fun max(a: Int, b: Int) = if (a > b) a else b

// Lambda function (anonymous function) assigned to a variable
val sumLambda = { a: Int, b: Int -> a + b }

// Call the lambda function
val result = sumLambda(7, 4) // result = 11

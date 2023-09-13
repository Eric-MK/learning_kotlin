//the vararg keyword is used to define a variable number of arguments (varargs) in a function. This allows you to pass a variable number of arguments of the same type to a function. When you use vararg, the arguments are treated as an array within the function, making it flexible for functions that need to accept multiple values.

fun exampleFunction(vararg values: Int) {
    for (value in values) {
        println(value)
    }
}

fun main() {
    exampleFunction(1, 2, 3, 4, 5)
}

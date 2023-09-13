fun exampleFunction(vararg values: Int) {
    for (value in values) {
        println(value)
    }
}

fun main() {
    exampleFunction(1, 2, 3, 4, 5)
}

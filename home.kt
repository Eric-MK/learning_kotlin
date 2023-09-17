class ExampleClass(param1: String, param2: Int) {
    val property1: String
    val property2: Int

    init {
        println("First init block (property1) executed")
        property1 = param1.toUpperCase()
    }

    init {
        println("Second init block (property2) executed")
        property2 = param2 * 2
    }

    companion object {
        init {
            println("Companion object init block executed")
        }
    }
}

fun main() {
    val example = ExampleClass("hello", 3)
    println("Property 1: ${example.property1}")
    println("Property 2: ${example.property2}")
}

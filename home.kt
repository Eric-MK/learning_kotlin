class ExpensiveObject {
    init {
        println("ExpensiveObject created")
    }

    fun doSomething() {
        println("ExpensiveObject is doing something")
    }
}

fun main() {
    // Declare a lazy property of type ExpensiveObject
    val lazyObject: ExpensiveObject by lazy {
        ExpensiveObject()
    }

    println("Before accessing lazyObject")

    // Accessing lazyObject for the first time (initialization occurs here)
    lazyObject.doSomething()

    println("After accessing lazyObject")

    // Accessing lazyObject again (no reinitialization occurs)
    lazyObject.doSomething()
}

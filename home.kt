fun main() {
    val day = 3  // It is similar to a switch statement in other programming languages, but it offers more flexibility and can be used as an expression, not just as a statement.
    val dayOfWeek = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        else -> "Weekend"
    }

    println("It's $dayOfWeek.")
}

// Define an enum class called DayOfWeek with an additional property 'abbreviation'
enum class DayOfWeek(val abbreviation: String) {
    MONDAY("Mon"),      // Enum constant with an abbreviation
    TUESDAY("Tue"),     // Enum constant with an abbreviation
    WEDNESDAY("Wed"),   // Enum constant with an abbreviation
    THURSDAY("Thu"),    // Enum constant with an abbreviation
    FRIDAY("Fri"),      // Enum constant with an abbreviation
    SATURDAY("Sat"),    // Enum constant with an abbreviation
    SUNDAY("Sun")       // Enum constant with an abbreviation
}

fun main() {
    // Create an instance of the enum class representing today's day
    val today = DayOfWeek.SATURDAY

    // Print the name and abbreviation of today's day
    println("Today is ${today.name}, abbreviated as ${today.abbreviation}")

    // Use a when expression to categorize the day of the week
    when (today) {
        // Check if today is Saturday or Sunday
        DayOfWeek.SATURDAY, DayOfWeek.SUNDAY -> println("It's the weekend!")

        // If not Saturday or Sunday, treat it as a weekday
        else -> println("It's a weekday")
    }
}

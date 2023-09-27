data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 30),
        Person("David", 25),
        Person("Eve", 35)
    )

    // Grouping people by age
    val groupedByAge = people.groupBy { it.age }

    // Printing the groups
    groupedByAge.forEach { (age, group) ->
        println("Age $age: $group")
    }
}

data class Person(val name: String, val age: Int)

fun main() {
    val sum = {x: Int, y: Int -> x + y}
    println(sum(2, 3))
    val persons = listOf(Person("Juan", 3), Person("Peter", 4))
    val bigger = persons.maxBy { it.age }
    println(bigger)
    println(persons.filter { p -> p.name.contains('n') })
    println(persons.map { p -> p.name.uppercase() })
    println(persons.none { p -> p.name.startsWith('A') })
}
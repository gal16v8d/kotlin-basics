data class Person(val name: String, val age: Int)

// superior order fun
fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}

// collection vs sequences
fun checkSequence() {
    val listValues = listOf(2,4,6,8)
    // sequence is not processed until final op is detected (in this case toList)
    // might be good fit for big collections when perf goes down
    val squaredValues = listValues.asSequence().map { it * it }.toList()
    println(squaredValues)
    var count = 10
    val mySequence = generateSequence {
        (count--).takeIf { it > 0 }
    }
    println(mySequence.toList())
}

fun main() {
    val sum = {x: Int, y: Int -> x + y}
    println(sum(2, 3))
    val persons = listOf(Person("Juan", 3), Person("Peter", 4))
    val bigger = persons.maxBy { it.age }
    println(bigger)
    println(persons.filter { p -> p.name.contains('n') })
    println(persons.map { p -> p.name.uppercase() })
    println(persons.none { p -> p.name.startsWith('A') })
    val testString = "a0b1c2d3e4f5g6"
    val justNumber = testString.filter { it in '0'..'9' }
    println(justNumber)
    checkSequence()
}
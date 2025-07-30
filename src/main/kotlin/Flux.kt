// control op and flux

fun switchExample(month: String) {
    val numberDays = when(month) {
        "jan", "mar", "may", "jul", "aug", "oct" -> 31
        "apr", "jun", "sep", "nov" -> 30
        "feb" -> 28
        else -> -1
    }
    println("Days of month %d".format(numberDays))
}

fun switchExampleTwo(age: Int) {
    val result = when {
        age < 13 -> "kid"
        age < 18 -> "Adolescent"
        age < 0 || age > 130 -> "Error"
        else -> "Adult"
    }
    println("Based on age %d then %s".format(age, result))
}


fun forLoopExample() {
    for (i in 1..10) {
        println("Value is %d".format(i))
    }
    val animals = arrayOf("dog", "cat", "turtle")
    for (animal in animals) {
        println("$animal have ${animal.length} chars")
    }
    for ((index, value) in animals.withIndex()) {
        if (index % 2 == 0) {
            println(value)
        }
    }
}

fun whileExample() {
    var x = 0
    do {
        print(x)
        x++
    } while (x <= 9)
    println("")
    var y = 9
    while (y >= 0) {
        print(y)
        y--
    }
    println("")
}

fun interruptJumpExample() {
    val listX = listOf(9, 8, 7, 6, 5, 4, 3, 2, 1)
    val listY = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    tagFirstFor@for (x in listX) {
        for (y in listY) {
            if (x == y) {
                println("Find matching element %d".format(x))
                break@tagFirstFor
            }
        }
    }
}

fun rangesExample() {
    // 1..5 -> range (inclusive) 1 to 5
    println("using downTo")
    for (i in 5 downTo 1) {
        println(i)
    }
    println("using step")
    for (j in 1..10 step 2) {
        println(j)
    }
    println("using until")
    for (k in 1 until 5) {
        println(k)
    }
    println("butter" in "alphabet".."soap")
    println("rose" in "alphabet".."data")
}

fun main() {
    switchExample("aug")
    switchExampleTwo(30)
    forLoopExample()
    whileExample()
    interruptJumpExample()
    rangesExample()
    // types check
    val day: Any = "day"
    println(day is Int)
    println(day is String)
    if (day !is Int) {
        println("$day")
    }
    // safe conversion
    val num: Number = 5.5
    // val numInt: Int = num as Int <- this would fail with cast class exc
    val numInt: Int? = num as? Int
    println(numInt)
}

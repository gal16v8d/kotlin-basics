class Sample {
    var firstName = ""
    var lastName = ""

    fun getFullName(firstNameOverride: String = "", lastNameOverride: String = ""): String {
        firstName = firstNameOverride
        lastName = lastNameOverride
        return "$firstName $lastName"
    }
}

class Sample2(var firstName: String = "", var lastName: String  = "") {

    fun getFullName(firstNameOverride: String = "", lastNameOverride: String = ""): String {
        firstName = firstNameOverride
        lastName = lastNameOverride
        return "$firstName $lastName"
    }
}

class Sample3 {
    constructor() {
        println("inside constructor")
    }
}

data class Sample4(val firstName: String, val lastName: String) {
    fun getFullName(): String {
        return "$firstName $lastName"
    }
}

enum class Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum class Color(val hex: Int) {
    COLOR_1(0xFA8072),
    COLOR_2(0xFFD700)
}

// extension
fun String.second() = get(1)

class Pc(val mem: Double, val processor: Processor) {
    class Processor(val cores: Int) {
        fun showInfo() {
            println("Cores $cores")
        }
    }
}

fun main() {
    println("First sample")
    val sample = Sample()
    println(sample.getFullName(firstNameOverride = "Test"))
    println(sample.getFullName(lastNameOverride = "Test"))
    println(sample.getFullName("Test", "Test"))
    println("Second sample")
    val sample2 = Sample2("", "")
    println(sample2.getFullName(firstNameOverride = "Test"))
    println(sample2.getFullName(lastNameOverride = "Test"))
    println(sample2.getFullName("Test", "Test"))
    println("Third sample")
    Sample3()
    println("Fourth sample")
    val sample4 = Sample4("Test", "Test")
    println(sample4.getFullName())
    println("Fifth sample")
    println(Color.COLOR_1.hex)
    for (day in Days.entries) {
        println(day)
    }
    println("Sixth sample")
    println("Pepe".second())
    println("Seventh sample")
    val processor = Pc.Processor(4)
    println(processor.showInfo())
}
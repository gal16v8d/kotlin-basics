import kotlin.math.PI
import kotlin.math.pow

// Functions

// fun with defaults
fun hello(name: String = "Unknown") {
    println("Hi $name")
}

fun helloWithAge(name: String = "Unknown", age: Int = 10) {
    println("Hi $name your age is $age")
}

fun withTyping(radius: Double): Double {
    return PI * radius.pow(2)
}

fun square(number: Double): Double = number * number

fun outerFun(arg: String) {
    fun innerFun() {
        println("Printing from inner fun $arg")
    }
    innerFun()
    println("Printing from outer fun $arg")
}

fun calcMultiArg(vararg values: Double) {
    var result = 0.0
    for (value in values) {
        result += value
    }
    println("result is $result")
}

fun main() {
    hello()
    hello("Alex")
    helloWithAge()
    helloWithAge("Pepe")
    helloWithAge(age = 15)
    val area = withTyping(2.5)
    println("Area is $area")
    println(square(4.0))
    outerFun("Test")
    calcMultiArg(1.1, 2.2, 3.3, 4.4)
}


import kotlinx.coroutines.*
import kotlinx.coroutines.launch

fun basicScenario() = runBlocking {
    launch {
        delay(1000L)
        println("World!")
    }
    print("Hello, ")
}

fun secondScenario() = runBlocking {
    launch {
        repeat(3) {
            delay(1000L)
            println("Za Warudo!!")
        }
    }
    println("Stoooop it!")
}

fun main() = runBlocking {
    basicScenario()
    secondScenario()
}
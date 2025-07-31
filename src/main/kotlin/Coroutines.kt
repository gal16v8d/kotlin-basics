import kotlinx.coroutines.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.withTimeout

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

// suspend fun
suspend fun slowFun() : Int {
    delay(1000L)
    println("Done!")
    return 1
}

// awaiting result
fun waitResult() = runBlocking {
    val result = async { slowFun() }.await()
    println("Result is $result")
}

fun withTimeOut() = runBlocking<Unit> {
    withTimeoutOrNull(1000L) {
        repeat(5) {
            println("Coroutine $it/5")
            delay(100L)
        }
    }
}

fun coroutineCustom() = runBlocking<Unit> {
    launch(CoroutineName("C1")) {
        println(this.coroutineContext)
        launch(CoroutineName("C2")) {
            println(this.coroutineContext)
        }
    }
}

fun main() = runBlocking {
    basicScenario()
    secondScenario()
    println(slowFun() )
    waitResult()
    withTimeOut()
    coroutineCustom()
}
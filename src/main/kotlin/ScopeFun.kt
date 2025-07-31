import java.io.File
import java.net.URL
import java.net.URLConnection

fun letSample() {
    val myVar = 5
    val myVar2 = myVar.let { it * 2 }
    println(myVar2)
    val names = listOf("Ana", "Juan", "Luis", "Sara")
    names.filter { it.contains('a') }.sorted().let { println(it) }
    val someOtherNames = listOf("Ana", "Juan", "Luis", "Sara", null)
    for (name in someOtherNames) {
        name?.let { println("Hi! $name") }
    }
}

fun withSample() {
    val names = mutableListOf("Ana", "Juan", "Luis", "Sara")
    with(names) {
        add("Maria")
        println("$this contains $size elements")
    }
}

class Food {
    var name: String = ""
}

fun applySample() {
    val food = Food().apply {
        this.name = "Beans"
    }
    println(food.name)
}

fun runSample() {
    val con: URLConnection = URL("https://es.wikipedia.org").openConnection()
    val data = con.run {
        connectTimeout = 2000
        inputStream.bufferedReader().readText()
    }
    println("data -> $data")
}

data class User(val name: String, val pass: String)

fun alsoSample() {
    val users = mutableListOf<User>()
    User("Ana", "1234")
        .also { users.add(it) }
        .also { println("User $it added!") }
}

fun takeSample() {
    val content = File("my-file.txt").takeIf { it.exists() }?.readText()
    println("Content is $content")
    val content2 = File("my-file.txt").takeUnless { !it.exists() }?.readText()
    println("Content2 is $content2")
}

fun main() {
    letSample()
    withSample()
    applySample()
    runSample()
    alsoSample()
    takeSample()
}
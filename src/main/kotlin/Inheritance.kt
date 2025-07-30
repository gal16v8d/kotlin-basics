open class Animal() {
    open fun emitSound() {
        println("?")
    }
}

class Cat: Animal() {
    override fun emitSound() {
        println("nya!")
    }
}

class Dog: Animal() {
    override fun emitSound() {
        println("woof!")
    }
}

fun main() {
    val animal = Animal()
    animal.emitSound()
    val cat = Cat()
    cat.emitSound()
    val dog = Dog()
    dog.emitSound()
}
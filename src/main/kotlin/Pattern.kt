// Dsl marker

@DslMarker
annotation class RestaurantMarker
// can  be used as this@restaurant.name ...

// secure/safe constructor

class Restaurant(var name: String? = null)

fun restaurant(block: Restaurant.() -> Unit) = Restaurant().apply(block)

// builder

class Restaurant2(val name: String? = null)

@RestaurantMarker
class RestaurantBuilder {
    var name: String? = null

    fun build(): Restaurant2 = Restaurant2(name)
}

fun restaurant2(block: RestaurantBuilder.() -> Unit) = RestaurantBuilder().apply(block).build()

// infix sample
class Person1(val age: Int) {
    infix fun isOlderThan(age: Int): Boolean {
        return this.age > age
    }
}

// invoke

class A(val name: String) {
    operator fun invoke() {
        println("My name $name has ${name.length} chars")
    }
}

fun main() {
    val newRestaurant = restaurant { name = "My Restaurant" }
    println("Restaurant name is '${newRestaurant.name }'")
    val newRestaurant2 = restaurant2 { name = "My Restaurant #2" }
    println("Restaurant name is '${newRestaurant2.name }'")
    val person1 = Person1(15)
    println("is adult? ${person1 isOlderThan 14}")
    println("is adult? ${person1 isOlderThan 18}")
    val aInstance = A("Maria")
    println(aInstance())
}

// Collection types samples

fun arrayDefinition() {
    val mixedArr = arrayOf(25, "Hero", true, 27.6f)
    val intArr = intArrayOf(10, 12, 14)
    val lonArr = longArrayOf(40, 50, 60)
    println(mixedArr.joinToString(","))
    println(intArr.joinToString(","))
    println(lonArr.joinToString(","))
}

fun listDefinition() {
    val names = listOf("Pepe", "Drake")
    val ages = mutableListOf(1, 2, 3)
    println("in zero %s or %s".format(names[0], names.get(0)))
    println("size %s or %s".format(ages.count(), ages.size))
}

fun setDefinition() {
    val shopList = setOf("Eggs", "Cheese", "Salt")
    val shopListMutable = mutableSetOf("Eggs", "Cheese", "Salt")
    println("contains %s or %s".format("Eggs", shopList))
    println("Pos for %s or %s".format("Salt", shopListMutable))
    val myCustomSet = setOf(1, 1)
    println("%s".format(myCustomSet.random()))
}

fun mapDefinition() {
    val valuesMut = mutableMapOf("COP" to "Colombia", "USD" to "USA")
    println("Countries %s".format(valuesMut.values.joinToString(",")))
    println("contains %s".format(valuesMut.contains("COP")))
}

fun main() {
    arrayDefinition()
    listDefinition()
    setDefinition()
    mapDefinition()
}
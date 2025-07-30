class Data<T>(var info: T)

fun <T> quantityIn(data: T, dataList: List<T>): Int {
    return dataList.count { it == data }
}

val <T> List<T>.secondLatest: T
get() = this[size - 2]

fun <T> testFun(arg: T) where T: Any {
    println(arg)
}

fun main() {
    val data = Data("Text")
    println(data.info)
    val dataList = listOf("text", "test", "texted", "text", "testing", "typing", "text")
    val amount = quantityIn("text", dataList)
    println("amount is $amount")
    val secondL = dataList.secondLatest
    println("second latest is $secondL")
    testFun("another test")
}
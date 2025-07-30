// Basic types

const val PI = 3.1415927

fun numberDefinition() {
    // this is mutable
    var age = 18
    println("current age is %d".format(age))
    age = 25
    println("current age is %d".format(age))
    // 8 bits
    val myByte: Byte = 1
    // 16 bits [-32768, 32767]
    val myShort: Short = 300
    // 32 bits [Int.MIN_VALUE, Int.MAX_VALUE]
    val myInt = 72
    // 64 bits [Long.MIN_VALUE, Long.MAX_VALUE]
    val myLong = 3000000000
    println("byte %d".format(myByte))
    println("short %d".format(myShort))
    println("int %d".format(myInt))
    println("lon %d".format(myLong))
}

fun floatDefinition() {
    // 32 bits (6/7 decimal precision)
    val myFloat = 2.6f
    // 64 bits (15/16 decimal precision)
    val myDouble = 2.0123456789
    println("float %s".format(myFloat))
    println("double %s".format(myDouble))
    println("PI %s".format(PI))
}

fun strDefinition() {
    val king = "King"
    println("Name is $king")
}

fun otherDefinition() {
    val myBool = true
    println("bool %s".format(myBool))
    val myChar = 'a'
    println("char %s".format(myChar))
    val hex = 0x10
    println("hex %d".format(hex))
    val binaryVal = 0b000010
    println("binary %d".format(binaryVal))
}

fun main() {
    numberDefinition()
    floatDefinition()
    strDefinition()
    otherDefinition()
}
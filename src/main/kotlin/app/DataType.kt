package org.example.sandbox

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
fun main() {
    // val: read-only variable
    val book = "Learning Kotlin Programming"

    // var: mutable variable
    var customers = 10
    customers = 20 // changing the value of a variable

    // string template, $ is used for string interpolation
    println("The book is: $book") // The book is: Learning Kotlin Programming
    println("Number of customers: $customers") // Number of customers: 20

    // basic data types
    var price = 19.99 // Double
    price = price * 1.2 // applying a discount, changing the value of price
    price += 5.0 // adding shipping cost
    price -= 2.0 // applying a coupon discount
    price *= 0.9 // applying a sale discount
    price /= 2.0 // halving the price
    println("Final price: $price") // Final price: 12.14

    // Integer operations
    val d: Int
    d = 10 // Integer

    // String operations
    val s: String
    s = "Hello, Kotlin!" // String

    // Boolean operations
    val isAvailable: Boolean
    isAvailable = true // Boolean

    // Character operations
    val c: Char
    c = 'K' // Char

    // Floating-point operations
    val f: Float
    f = 3.14f // Float
    // Double operations

    val g: Double
    g = 2.718 // Double

    // Unsigned Integer operations
    val u: UInt
    u = 42u // UInt

    println("Integer: $d, String: $s, Boolean: $isAvailable, Char: $c, Float: $f, Double: $g, Unsigned Int: $u") // Integer: 10, String: Hello, Kotlin!, Boolean: true, Char: K, Float: 3.14, Double: 2.718, Unsigned Int: 42

    // Variable declared without initialization
    var uninitializedVariable: Int // This variable is declared but not initialized
    // println("Uninitialized variable: $uninitializedVariable") // Uninitialized variable: 0

}

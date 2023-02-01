package basic.range


//val range = 1..100
val range = 100 downTo 1 step 2

fun main() {

    println(range.count())
    println(range.contains(72))
    println(range.contains(138))
    println(range.first)
    println(range.last)
    println(range.step)

}
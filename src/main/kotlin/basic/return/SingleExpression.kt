package basic.`return`


private fun kali(a: Int, b: Int): Int {
    return a * b
}


private fun perkalian(a: Int, b: Int): Int = a * b


private fun sayhai(name: String) = println("Hi $name")


fun main() {
    println(kali(2, 4))
    println(perkalian(4, 8))
    sayhai("Ikhsan")
}
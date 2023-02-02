package basic.`return`


private fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}


// duplicate return keyword
private fun bagi(a: Int, b: Int): Int {
    if (b == 0){
        return 0
    } else {
        val result = a/b
        return result
    }
}

private fun sayHello(name: String): String {
    when(name){
        "" -> return "Hello Bro"
        else -> return "Hello $name"
    }
}


// without duplicate return keyword
private fun pembagian(a: Int, b: Int): Int {
    return if (b == 0){
        0
    } else {
        val result = a/b
        result
    }
}

private fun sayHai(name: String = ""): String {
    return when(name){
        "" -> "Hai Bro"
        else -> "Hai $name"
    }
}



fun main() {
    println(sum(12,5))

    val result = sum(23, 7)
    println("The result is $result")

    println(bagi(100, 0))
    println(bagi(10,2))

    println(pembagian(100, 0))
    println(pembagian(10,2))

    println(sayHello("ikhsan"))
    println(sayHello(""))

    println(sayHai(""))
    println(sayHai("dika"))

}
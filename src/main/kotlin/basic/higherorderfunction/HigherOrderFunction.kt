package basic.higherorderfunction


//function yang menggunakan function sebagai parameter atau mengembalikan function lain


private fun hello(name: String, lambdaTransformer: (String)-> String): String {
    // lambda akan mengeksekui param name terlebih dulu
    val nameTransform = lambdaTransformer(name)
    // setelah selesai baru di-return
    return "Hello $nameTransform"
}

// synchronous
fun total(a: Int, b: Int, sum: (a: Int, i: Int, g: Int) -> Int): String{
    val result = sum(a,b,b)
    return "hasil dari $a + $b - $b = $result"
}



fun main() {

    // membuat lambda expression dalam variable
    val lambdaUpper: (String) -> String = {
        it.uppercase()
    }
    val lambdaUpper1 = { value: String ->
        value.uppercase()
    }

    println(hello("ikhsan",lambdaUpper))
    println(hello("mardi",lambdaUpper1))

    // membuat lambda expression langsung dalam parameter
    val result = hello("MARDI", {value: String -> value.lowercase()})
    println(result)

    // trailling lambda
    val result1 = hello("DIKA"){ value: String ->
        value.lowercase()
    }
    println(result1)


    val hasil = total(20, 30){ inputA: Int, inputB: Int, valueC: Int ->
        inputA + inputB - valueC
    }
    println(hasil)

}


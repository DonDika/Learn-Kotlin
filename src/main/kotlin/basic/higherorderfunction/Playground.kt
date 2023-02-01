package basic.higherorderfunction


private fun result(a: Int, b: Int, sum: (param1: Int, param2: Int, param3: Int) -> Int): String {

    val result = sum(a,b,a)

    return "hasil dari $a + $b - $a = $result"
}


fun main() {

    val total = result(
        a = 20,
        b = 10,
        sum = { arg1: Int, arg2: Int, arg3: Int ->
        arg1 + arg2 - arg3 }
    )
    println(total)

}





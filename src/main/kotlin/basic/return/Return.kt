package basic.`return`


private fun returnValue(input: Int?): String{
    if (input == null) return "Tidak ada nilai input"
    else return "Ini nilai yg dikembalikan $input"
}

//tanpa return type
private fun keranjang1() {
    println(20)
}

//dengan return type
private fun keranjang2(): Int {
    return 20
}

private fun keranjang3(a: Int?): Int {
    if(a == null){
        return 0
    } else {
        val result = a
        return result
    }
}


fun main(){
    println(returnValue(null))
    println(returnValue(0))

    println(keranjang1())
    println(keranjang2())

    //println(keranjang1() - 3) //error karena tidak mempunyai nilai nyata
    println(keranjang2() - 3)

    println(keranjang3(null))
    println(keranjang3(10))
}



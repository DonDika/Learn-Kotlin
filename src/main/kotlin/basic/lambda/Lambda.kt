package basic.lambda

// function yang tidak memiliki nama, bisa membuat function tanpa harus mendeklarasikan function tersebut
// function dapat langsung dimasukkan ke dalam variable/array/parameter


// function basic
private fun name(firstName: String, lastName: String): String {
    return "my name is $firstName $lastName"
}

// lambda expression dalam variable
val lambdaName: (String, String) -> String = { firstName: String, lastName: String ->
    "my name is $firstName $lastName"
}


// keyword it
val lambdaHello: (String) -> String = {
    "Heloo $it"
}

val lambdaHai = { value: String ->
    "Haii $value"
}


val lambdaData: (NameData) -> String = {
    it.firstName
}

val lambdaData2 = { value: NameData ->
    value.firstName
}

fun dataName(it: NameData): String {
    return it.lastName
}


val angka = { value: Int ->
    value
}

fun angkaa(a: Int): Int{
    return a
}

val a = angkaa(31)

fun main() {
    println(name("ikhsan","mardika"))
    println(lambdaName("mardika", "ikhsan"))
    println(lambdaHello("Budi"))

    println(lambdaHai("yanto"))

    val data = NameData("ikhsan", "mardika")
    println(lambdaData(data))
    println(dataName(data))
    println(lambdaData2(data))

    println(angka(10))
    println(a)
}
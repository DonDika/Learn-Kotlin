package basic.looping.`for`

fun main() {

    //basic()
    dataStudent()
    //nestedLoop()

}

private fun basic(){
    /*
    println("Halo World")
    println("Halo World")
    println("Halo World")
    println("Halo World")
    println("Halo World")
    */

    for (i in 0..20 step 3){
        println("Hallo world index ke $i")
    }
    println("end loop")

    for (i in 10 downTo 0 step 2){
        println("Hallo world index ke $i")
    }
    println("end loop")
}

private fun nestedLoop(){
    /*for (i in 1..5){
        for (j in 1..3){
            for (k in 1..2){
                print("k")
            }
            print("j")
        }
        println("i")
    }
    println("end")*/

    for(row in 1..5){
        for(column in 1..row){
            print(column)
        }
        println()
    }
}


private fun dataStudent(){
    val data = arrayOf(
        Student("Ikhsan", 20),
        Student("Dika", 22),
        Student("Mardi", 19)
    )
    for (i in data){
        println("Nama = ${i.name} \n" +
                "Umur = ${i.age}")
    }
    println(data.size)
}



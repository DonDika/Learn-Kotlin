package oop.`object`


class Number {

    fun randomNumb(){
        x = 35
        randomNumber()
    }


    companion object {
        private var x = 0
        //tidak akan diubah
        private const val y = 40

        fun randomNumber(){
            val random = (x..y).random()
            println("Random numbers = $random")
        }
    }

}





fun main() {

    //Object
    println(Numbers.APP_NAME)
    Numbers.helloMate()

    //Companion Object
    Number.randomNumber()

    //Instance Object
    val number = Number()
    number.randomNumb()

}
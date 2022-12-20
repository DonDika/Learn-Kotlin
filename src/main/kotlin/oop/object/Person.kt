package oop.`object`

//CLASS
class Person {

    val name: String = "ikhsan"
    fun message(){
        println("tamvan")
    }

}

//OBJECT
object PersonOne{

    //object is a data type with a single implementation,
    //object never be instantiated because there is only one instance of it
    //properties dan function disini seperti static pada java
    //object tidak dapat memiliki constructor
    val name: String = "dika"
    fun message(){
        println("ganteng")
    }

}

open class Human {
    val name: String = "don.dika"
    fun message(){
        println("ganteng")
    }
}

//OBJECT INHERIT
object PersonTwo : Human() {

}

//IMPLEMENT
fun main() {

    //membuat instance class sehingga menjadi object
    //memiliki 2 object dari class Person dan disimpan ke variable
    //namun jika singleton object maka hanya bisa memiliki 1 object
    val person = Person()
    val person1 = Person()

    //mengakses member pada class
    println(person.name)
    person.message()

    println(person1.name)
    person1.message()


    //dengan object kita tidak perlu membuat instance
    //untuk mengakses member pada object harus sesuai dengan nama object nya
    //disini berarti kita hanya memiliki 1 object
    println(PersonOne.name)
    PersonOne.message()

    //menerapkan inheritance object
    println(PersonTwo.name)
    PersonTwo.message()


}
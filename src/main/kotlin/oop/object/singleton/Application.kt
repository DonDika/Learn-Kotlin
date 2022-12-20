package oop.`object`.singleton

class Application(val name: String) {

    object Utilities{
        fun toUpper(name: String): String{
            return name.uppercase()
        }
    }



}

 /*
Singleton Pattern
-Sebuah pattern yang membatasi suatu object hanya memiliki satu instance saja dan satu cara akses ke instance tersebut.
Singleton tidak memiliki constructors
*/
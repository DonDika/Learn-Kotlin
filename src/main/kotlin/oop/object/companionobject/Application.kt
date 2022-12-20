package oop.`object`.companionobject

class Application(val name: String) {

    val name1 = name

    companion object {
        fun hello(name: String): String{
            return "Hello $name"
        }
    }

}

/*
Companion object
-Kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object.
-Harus berada di dalam class.
-Keuntungannya adalah saat kita memanggil member nya, kita hanya perlu memanggil nama kelasnya (Applicaton.hello())
*/

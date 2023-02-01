package basic.extensionfunction


/*
  extension function:
  menambahkan function pada tipe data yang sudah ada.
  bukan function yang sudah pada sebuah class atau interface.
  bukan memodifikasi pada class aslinya atau yang sudah ada,
  sehingga tidak ada perubahan yang terjadi pada class aslinya.
  hanya sebuah function bantuan atau tambahan.
  mirip seperti helper function.
*/


class Student(val name: String?, val grade: Int?) {
    //fun sayGoodbye()
    //fun permission()
}

class Teacher(val name: String, private val course: String) {
    //fun sayGoodbye()
    //fun permission()
}




// Karena tidak ada function yang kita butuhkan, sehingga kita membuat extension function
private fun Student.sayHello(name: String){
    println("Hello $name, my name ${this.name} I am from class ${this.grade}")
}

private fun Teacher.sayHai(guys: String){
    // tidak bisa mengakses data private dari class tersebut
    //println("Hello $guys, my name ${this.name} I am teaching ${this.course}")
    println("Hello $guys, my name ${this.name} I am teaching..")
}

//nullable
private fun Student?.sayHai(name: String){
    if (this != null){
        println("Hello $name, my name ${this.name} I am from class ${this.grade}")
    }
}




fun main() {
    val student = Student("Ikhsan", 4)
    student.sayHello("Agus")

    val teacher = Teacher("Eko", "Computer Science")
    teacher.sayHai("Rokies")


    val student2 = Student(null, null)
    student2.sayHai("Budi")
}




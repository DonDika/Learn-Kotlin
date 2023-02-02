package basic.array

//String
val names: Array<String> = arrayOf("Ikhsan","Dodi","Yanto")

//Int
val numbers = intArrayOf(2,4,6,8,10)

//Mix
val mixArray = arrayOf(1,3,"Ikhsan",5,"Ganteng",20)



fun main() {

    println(names[1])

    names.set(2,"Ruli")
    println(names[2])

    println(numbers[3])
    numbers[3] = 14
    println(numbers[3])


    println(mixArray[1])

}
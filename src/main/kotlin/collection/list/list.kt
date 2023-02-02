package collection.list

fun main() {
    //immutableList()
    mutableList()
}


private fun immutableList(){
    val listName: List<String> = listOf("ikhsan","cahya", "mardika")

    /*for (name in listName){
        println(name)
    }*/
    println(listName[0])
    println(listName[1])
    println(listName[2])
    println(listName.indexOf("ikhsan"))
    println(listName.contains("Ikhsan".lowercase()))
    println(listName.isEmpty())
    println(listName.isNotEmpty())
}


private fun mutableList(){
    //data kosong
    val listName: MutableList<String> = mutableListOf()

    //modifikasi data
    listName.add(0,"dika")
    listName.add("yanto")
    listName.add("kopet")

    for (names in listName){
        println(names)
    }
    println()

    listName.removeAt(1)
    for (names in listName){
        println(names)
    }
}






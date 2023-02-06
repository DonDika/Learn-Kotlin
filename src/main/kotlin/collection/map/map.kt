package collection.map

fun main() {

    //immutableMap()
    mutableMap()

}


private fun immutableMap(){
    val map: Map<String, String> = mapOf(
        "a" to "Ikhsan",
        "b" to "Cahya",
        "c" to "Mardika"
    )

    //println(map.entries)
    //println(map["a"])
    //println(map.keys)
    //println(map.values)

    for ((key, value) in map){
        println("$key to $value")
    }
}


private fun mutableMap(){
    // map kosong
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    // add map data
    mutableMap.put("a","Ikhsan")
    mutableMap["b"] = "ganteng"
    mutableMap["c"] = "Mardika"

    println(mutableMap.getOrDefault("d","There is no value for key d"))
    println(mutableMap.get("d"))


    for ((key, value) in mutableMap){
        println("$key and $value")
    }

    mutableMap.remove("b")
    println(mutableMap["b"])


    for ((key, value) in mutableMap){
        println("$key and $value")
    }
}













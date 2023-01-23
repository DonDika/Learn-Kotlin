package oop.nullsafety


data class Friend(
    val name: String
)


/*
//Checking null
private fun sayHello(friend: Friend?){
    if (friend != null){
        println("Hello ${friend.name}")
    }
}
*/


//Safe call
private fun sayHello(friend: Friend?){
    println("Hello ${friend?.name}")
}


/*
// Elvis operator
private fun sayHello(friend: Friend?){
    val name = friend?.name ?: "friend"
    println("Hello $name")
}
*/


/*
// !! operator
// not recommended
private fun sayHello(friend: Friend?){
    val name = friend!!.name
    println("Hello $name")
}
*/

fun main() {
    val friend = Friend("Ikhsan")
    sayHello(friend)
    sayHello(Friend("Dika"))
    sayHello(null)

}
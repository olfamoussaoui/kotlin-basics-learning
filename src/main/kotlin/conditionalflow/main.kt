package conditionalflow

fun main() {
    // Explore: Conditional Flow => if
    val age = 26
    val result = if (age > 30) "you still look good damn" else "you are so beautiful"
    println("result = $result")

    // Explore: Conditional Flow => when
    when (result){
        "you still look good damn" -> println("Too young")
        "you are so beautiful" -> println("you look good")
        else -> {
            println("resutl is neither nor 2")}
    }

    // Explore: Conditional Flow => when with range
    val range = 10 .. 25
    val x = 20
    when(x) {
        in 1 .. 100 -> println("x is in the range :)")
        in range -> println("x is valid")
        else -> {
            println("Ok u didn't get it :(")
        }
    }
}
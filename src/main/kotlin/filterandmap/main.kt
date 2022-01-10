package filterandmap

import java.util.*

fun main() {
    data class Person(val age: Int, val name: String) 
    val people = listOf(Person(26, "olfa"), Person(24, "Ibrahim"))
    println("people.filter { it.age> 25 } = ${people.filter { it.age>= 26 }}")

    //Explore: map
    var birth_year = people.map { it -> Calendar.getInstance().get(Calendar.YEAR) - it.age }
    println("birth_year = ${birth_year}")
}
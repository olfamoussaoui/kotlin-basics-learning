package classes

import java.lang.IllegalArgumentException
import java.util.*

fun main() {
    //Explore: Classes => custom getters and setter
    class Person (val id: Int, var name: String, val yearOfBirth: Int) {
        val age: Int
            get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
        var socialSecurityNumber: String = ""
            set(value) {
                if (!value.startsWith("SN")){
                    throw IllegalArgumentException("Social security number should start with SN")
                }
                field = value
            }

    }

    var person = Person(12, "Olfa", 1995)
    println("Age of ${person.name} = ${person.age}")
    person.socialSecurityNumber = "SN-5684"
    println("person.socialSecurityNumber = ${person.socialSecurityNumber}")

    //Explore: Data classes
    data class Customer(var id: Int, var name:String, var email: String, var favoriteColor: Color)
    var customer = Customer(12, "olfa", "moussaoui.olfa1@gmail.com", Color.BLUE)
    println("customer's favorite color = ${customer.favoriteColor.rgb}")
}

// Explore: enum
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
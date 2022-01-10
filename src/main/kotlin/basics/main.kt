import java.lang.IllegalArgumentException
import java.util.*

fun main() {
    println("Hello kotlin!")
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
    println("languages = $languages")
    //Explore: String template
    val name:String ="Olfa"
    val s = "Hello $name"
    val str = """This is a multiline 
            string.
            It's fun.
            Try it""".trimMargin()
    println("str = ${str}")

    //Explore: Ranges and loops
    // rangeTo
    val tranche_age = 21 .. 30
    val start = 1
    val end = 10
    val range = start .. end
    println("tranche_age = $tranche_age")

    // downTo
    val range_age = 30 downTo 21
    val start_1 = 4
    val end_1 = 1
    val range_1 = start_1 downTo end_1
    println("range_age = $range_age")

    //Explore: for loops
    for (a: Int in 5 .. 9) println("a= $a")
    for (b in 100 downTo 90 step 2) println("b = $b")
}
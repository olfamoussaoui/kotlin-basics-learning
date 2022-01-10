package extensions

fun main() {
    fun String.lastChar(): Char = this[this.length - 1]
    val name = "Olfa"
    println("name.lastChar() = ${name.lastChar()}")
    println("name.prefixStuff(\"Madame\") = ${name.prefixStuff("Madame")}")
}

fun String.capStuff() = this.uppercase()
fun String.prefixStuff(prefix: String) = "$prefix $this"
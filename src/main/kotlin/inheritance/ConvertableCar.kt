package inheritance

class ConvertableCar: Car("", "") {
    override val mark = "Tesla"
    override val model = "fifth edition"
}
fun main() {
    val convertableCar = ConvertableCar()
    println("convertableCar.mark = ${convertableCar.mark}")
}
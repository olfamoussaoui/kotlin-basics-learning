package inheritance

class Hippo(s: String, s1: String) : Animal() {
    override val food: String
        get() = super.food

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }
    override fun eat() {
        println("The Hippo is eating $food")
    }
}
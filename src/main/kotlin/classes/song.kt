package classes

fun main() {
    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")

    songOne.play()
    songTwo.play()
    songOne.stop()
    songThree.play()
}
class Song(private val title: String, val artist: String) {
    fun play() {
        println("Playing $title")
    }
    fun stop() {
        println("Stopping $title")
    }
}

package moreclasses

class Computer (val processaorModel: String) {
    inner class Memory {
        fun getMemoryLevel(): Int {
            println(processaorModel)
            return 70
        }
    }
}

fun main() {
    val m1: Computer.Memory = Computer("Intel").Memory()
    m1.getMemoryLevel()
}
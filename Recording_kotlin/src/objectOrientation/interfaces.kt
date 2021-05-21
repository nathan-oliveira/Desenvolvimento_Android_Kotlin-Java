package objectOrientation

interface IMaquina {
    var peso: Float
    fun ligar()
}

interface I1 {
    fun ola() {
        println("I1")
    }
}

interface I2 {
    fun ola() {
        println("I2")
    }
}

class ImplementarInteface : I1, I2 {
    override fun ola() {
        super<I1>.ola()
    }
}

class Computadores(override var peso: Float) : IMaquina {
    override fun ligar() {
        println("ligar")
    }
}

fun main() {
    val c = Computadores(70f)
    c.ligar()
}
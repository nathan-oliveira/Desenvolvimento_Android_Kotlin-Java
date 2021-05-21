package objectOrientation

// open => libera a classe para ser herdada
open class Maquinas (val marca: String) {
    open fun minhaMarca() {
        println("Minha marca é $marca")
    }
}

class Computador(marca: String, val nucloes: Int) : Maquinas(marca) {

    override fun minhaMarca() {
        println("Estou reescrevendo minha marca!!")
    }

    fun ligar() {

    }

    fun processar() {

    }

    // sobrecarga (overload)
    fun overload(i: Int) = println("Overload 1")
    fun overload(i: String) = println("Overload 2")

    private fun validate() {

    }
}

fun main() {
    val c: Computador = Computador("xpto", 10)

    with(c) {
        ligar()
        processar()
        minhaMarca()
        overload(1) // Overload 1
        overload("teste") // Overload 2
    }
}
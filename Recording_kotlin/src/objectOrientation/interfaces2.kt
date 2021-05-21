package objectOrientation

class Pessoa {
    lateinit var nome: String;

    fun geradorDeNome() {
        nome  = "Nunca nem vi"
        // nome?.length
    }
}

fun main() {
    val p = Pessoa()
    p.geradorDeNome()
}
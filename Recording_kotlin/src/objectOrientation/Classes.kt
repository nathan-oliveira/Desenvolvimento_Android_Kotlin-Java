package objectOrientation

class Pessoa1 {

}

class Pessoa2 (var nome: String, var anoNascimento: Int) {

}

class Pessoa3 (var nome: String) {
    var ano: Int? = null;

    constructor(nome: String, ano: Int): this(nome) {
        this.ano = ano;
    }

    fun saudacao() {
        println("Olá $nome")
        if (ano != null)
            println("Idade $ano")
    }
}

fun main() {
    /*
    val pessoa3: Pessoa3 = Pessoa3("Nathan", 1999)
    pessoa3.saudacao()
    println(pessoa3.nome)
    println(pessoa3.anoNascimento)
    */

    // getter setter

    val p1: Pessoa3 = Pessoa3("Nathan", 1999)
    val p2: Pessoa3 = Pessoa3("Nunca nem vi")

    p1.saudacao()
    p2.saudacao()
}
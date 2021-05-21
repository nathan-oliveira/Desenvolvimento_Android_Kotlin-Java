package objectOrientation

class Maquina (var marca: String) {

    var nucleos: Int = 0
        get() {
            println("get foi chamado")
            return  field
        }
        set(value) {
            println("set foi chamado")
            field = value
        }

    fun ligar() {

    }

    fun processar() {

    }

    fun desligar() {

    }
}

fun main () {
    var m = Maquina("xpto")
    println(m.nucleos)
    m.nucleos = 10;

    with(m) {
        ligar()
        processar()
        desligar()
    }

    /*
    val p: Pessoa = Pessoa()
    p.nome = "teste" //setter
    println(p.nome) //getter
    */
}
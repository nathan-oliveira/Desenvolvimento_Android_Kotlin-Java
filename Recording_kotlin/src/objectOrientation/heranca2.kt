package objectOrientation

// tipo métodos estáticos (static)
class Constants {  // class Constants private constructor() { // privou tudoooo!!!!!!!!
    companion object {
        val TABLE = "Pessoa"

        fun teste() {
            println("Sou um métodos estático")
        }
    }

    object VENDAS {
        val TABLE = "Vendas"

        fun teste() {
            println("Sou um métodos estático")
        }

        object COLUNAS {
            val ID = "id"
            val TOTAL = "total"
        }
    }
}

fun main() {
    println(Constants.TABLE)
    Constants.teste()

    println(Constants.VENDAS.TABLE)
    Constants.VENDAS.teste()

    println(Constants.VENDAS.COLUNAS.ID)
    println(Constants.VENDAS.COLUNAS.TOTAL)
}
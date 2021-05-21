fun endereco(rua: String = "", cidade: String, estado: String, cep: String, numero: Int = 0) {
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")
}

fun main() {
    endereco("","","","",0);
    // endereco(estado = "SP")
}
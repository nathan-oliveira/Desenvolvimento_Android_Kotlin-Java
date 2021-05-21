fun media3(vararg notas: Float) {
    if (notas.isNotEmpty()) {
        var soma = 0f;

        for (nota in notas) {
            soma += nota;
        }

        println("A média é: ${soma / notas.size}")
    }
}

fun endereco(rua: String = "") {

}

fun <T> media(vararg valores: T) { // "T" = "Any"
    for (valor in valores) {
        println(valor)
    }
}

fun main() {
    //media(8f, 9f, 8f)

    val str = "lorem ipsum"
    str.capitalize() // Converter a primeira letra para maiuscula
    str.decapitalize() // Converter a primeira letra para minuscula
    str.contains("ipsum") // verificar se a string tem o valor "ipsum"
    str.startsWith("l", false) //verifica se começa com a letra "l", ignorando se a letra é maiuscula ou minuscula.
    str.startsWith("L") // verifica se começa com a letra "L"

    arrayOf(1,2,3,4,5,6).size
}
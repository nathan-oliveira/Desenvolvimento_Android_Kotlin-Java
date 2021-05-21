package objectOrientation

enum class Prioridade1 {
    BAIXA, MEDIA, ALTA
}

// override
enum class Prioridade2 (val id: Int) {
    BAIXA(1) {
        override fun toString(): String {
            return "Super baixa, não se preocupe"
            // return super.toString()
        }
    },
    MEDIANA(5),
    ALTA(10)
}

class Alarme(var desc: String, p: Prioridade2) {

}

fun main() {
    println(Prioridade1.BAIXA)
    println(Prioridade2.MEDIANA.id)

    // Alarme("", Prioridade2.ALTA)


    for (p in Prioridade2.values()) {
//        if (p.toString() == "MEDIA") {
//            println("Verdade!")
//        }
        println("$p = $p.id | ${p.ordinal}")
    }
}
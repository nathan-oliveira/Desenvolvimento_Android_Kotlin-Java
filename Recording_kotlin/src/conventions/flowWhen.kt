fun operecao(a: Int, b: Int, c: String) {
    val v1 = when (c) {
        "Soma" -> a + b;
        "Subtração" -> a - b;
        else -> {
            println("Operação incorreta");
            0;
        };
    }

    val v2 = when {
        (a > 0 && b > 0) -> {
            println("Variáveis maiores que zero");
            true;
        }
        else -> println("Variáveis menores que zero");
    }

    // Range - Intervalo de Valores ..  1..10   = de um até o dez
    val v3 = when {
        ((a in 1..99) && (b > 0)) -> println("Sim");
        else -> println("Vish");
    }

    val v4 = when(a) {
        in 1..99 -> println("Sim");
        else -> println("Vish");
    }

//     when (c) {
//        "Soma" -> {
//            return a + b;
//        }
//        "Subtração" -> {
//            return a - b;
//        }
//        else -> {
//            println("Operação incorreta");
//            return 0;
//        }
//    }

}

fun main() {
    operecao(10, 10, "Soma");
    operecao(10, 10, "Subtração");
}
/*
Type    Bit
Double  64
Float   32
Long    64
Int     32
Short   16
Byte    8
Boolean ?
String  ?
Char    ?
*/

/*
Lembrando sobre unidades de medida
1 Byte = 8 Bits
1 kilobyte (KB) = 1024 bytes
1 megabyte (MB) = 1024 kilobytes
1 gigabyte (GB) = 1024 megabytes
*/

fun main() {
    println("Olá mundo!");

    println("Double: Max: " + Double.MAX_VALUE + " - Min: " + Double.MIN_VALUE);
    println("Float: Max: " + Float.MAX_VALUE + " - Min: " + Float.MIN_VALUE);
    println("Long: Max: " + Long.MAX_VALUE + " - Min: " + Long.MIN_VALUE);
    println("Int: Max: " + Int.MAX_VALUE + " - Min: " + Int.MIN_VALUE);
    println("Short: Max: " + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE);
    println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " + Double.MIN_VALUE);

    // Variáveis mutáveis
    var nome = "Nathan Oliveira";
    nome = "Nathan Oliveira Mendonça";

    // Variáveis imutáveis
    val x: Int; // é obrigado a colocar a tipagem
    val idade = 10;
    //idade = 11; -> VAI DAR ERRO!!

    println(nome);


    // Concatenação
    val frase = "Kotlin é uma linguagem";
    val caracteristica = "show!";
    val result = "$frase $caracteristica";
    println(result);

    val str = """qualquer coisa
        |quebra de linha
        |para formatar
    """.trimMargin()
    println(str.length);


    // Criação de funções
    val a = 10;
    val b = 20;
    val c = 30;

    calculaBonus(a, b, c);
    calculaBonus(b, c, a);
    calculaBonus(c, a, b);

    hello(nome);
    println(hello2(nome));
    println(soma(2, 2));


    // operações
    println("2 + 2 ${2 + 2}");
    println("2 - 2 ${2 - 2}");
    println("2 / 2 ${2 / 2}");
    println("2 * 2 ${2 * 2}");
    println("10 % 4 ${10 % 4}");
    println("10 % 2 ${10 % 2}");

    var numero: Int = 10;

    println("numero++ = ${numero++}");
    println("numero-- = ${numero--}");

    println("++numero = ${++numero}");
    println("--numero = ${--numero}");

    numero += 2;
    println("numero+= 2 = $numero");

    numero -= 2;
    println("numero+= 2 = $numero");

    numero /= 2;
    println("numero /= 2 = ${numero}");

    numero *= 2;
    println("numero *= 2 = ${numero}");

    numero %= 3;
    println("numero %= 3 = ${numero}");


    // Conversão de Valores
    val n1: Double = Double.MAX_VALUE;
    val b1: Byte = 100;

    println(b1.toDouble());
    println(b1.toFloat());
    println(b1.toLong());
    println(b1.toShort());

    // "91".toInt();
    // "19".toFloat();
    // "11".toDouble();


    // Controle de fluxo
    maiorDeIdade(10);
    maiorDeIdade(18);
    maiorDeIdade(27);

    // Operador Elvis ?:
    val test1: Int? = null;
    val op1: Int = test1 ?: 100;
    println(op1);
}

// Controle de fluxo
fun maiorDeIdadeBoolean(idade: Int): Boolean {
    return idade >= 18;
}

fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("Maior de idade!");
    } else {
        println("Menor de idade!");
    }
}

fun calculaBonus2(cargo: String, salario: Float): Float {
    var bonus: Float = salario;

    if (cargo.contains("Coordenador") && !cargo.contains("Gerente")) {
        bonus = salario * 0.2f;
    }

    val valor = 10;
    val srt = if(valor === 10) "Sim" else "Não";
    println("$valor é igual 10? $srt");

//    if (cargo == "Coordenador") {
//        return salario * 0.2f;
//    } else if(cargo.contains("Gerente Senior")) {
//        return salario * 2;
//    } else if (cargo.contains("Gerente Junior")) {
//        return salario * 0.5f;
//    }
    return bonus;
}

// operações
fun calculaBonus(a: Int, b: Int, c: Int) {
    println("O bônus é: ${a + b * c} ");
}

fun hello(nome: String) {
    println("Olá $nome")
}

fun hello2(nome: String): String = "Olá $nome";
fun soma(a: Int, b: Int): Int = a + b;

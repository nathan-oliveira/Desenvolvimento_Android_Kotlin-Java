import java.lang.Exception
import java.lang.NumberFormatException

/*
Double  64
Float   32
Long    64
Int     32
Short   16
Byte    8
*/

fun main() {
    //val n1: Double = Double.MAX_VALUE;
    val b1: Byte = 100;

    println(b1.toShort()); // 100
    println(b1.toLong()); // 100
    println(b1.toFloat()); // 100.0
    println(b1.toDouble()); // 100.0

    try {
        println("teste".toInt())
    } catch (e: Exception) {
        println("Algo errado aconteceu!!!")
    } catch (e: NumberFormatException) {
        println("Esse valor não é um número!!!")
    } finally {
        println("FIM!!!")
    }
}
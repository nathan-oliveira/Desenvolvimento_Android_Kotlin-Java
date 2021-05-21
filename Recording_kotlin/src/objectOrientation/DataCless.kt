package objectOrientation

/*
data class Param(var b: Boolean, var s: String, var i: Int) {
    fun tes() {
        println("Teste")
    }
}

fun teste(p: Param) {
    //Param(false, "", 10).tes()
}
*/
/*
class Quadrado(val area:Float) {

 override fun toString(): String {
     return "Quadrado(area=$area)"
     //super.toString()
 }

}
*/

/*
class Quadrado(val area:Float) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}
*/

class Quadrado(val area:Float) {

}

data class Triangulo(val area:Float)
data class Param(var b: Boolean, var s: String, var i: Int)

fun main() {
    var q1 = Quadrado(10f)
    var q2 = Quadrado(10f)

    var t1 = Triangulo(10f)
    var t2 = Triangulo(10f)

    println(q1)
    println(t1)

    println(q1 == q2) // sem override fun equals (false), com override fun equals (true)
    println(t1 == t2) // true


    println(q1.hashCode())
    println(q2.hashCode())

    println(t1.hashCode()) // iguais
    println(t2.hashCode()) // iguais

    //copy
    val t3 = t2.copy();
    println(t3)

}
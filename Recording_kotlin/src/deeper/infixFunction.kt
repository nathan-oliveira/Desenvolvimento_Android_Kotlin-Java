package deeper

class Person(val name: String) {
    infix fun isName(value: String): Boolean {
        return value == name;
    }
}

infix fun Int.isHalfOf(value: Int) = value / 2 == this

fun main(args: Array<String>) {
    10.isHalfOf(40)
    10 isHalfOf 30

    val p1: Person = Person("Nathan")
    p1 isName "Nathan"
}

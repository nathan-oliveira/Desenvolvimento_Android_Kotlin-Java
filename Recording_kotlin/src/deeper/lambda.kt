package deeper

fun operator2(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum2 (x: Int, y: Int) = x + y
fun multiply2 (x: Int, y: Int) = x * y

fun main(args: Array<String>) {
    operator2(1, 2, ::sum2)
    operator2(1, 2, ::multiply2)

    val l1 = { a: Int, b: Int -> a + b}
    val l2: (Int, Int) -> Int = { u, i -> u + i }
    operator2(10, 20, l1)
    operator2(10, 20, l2)
}
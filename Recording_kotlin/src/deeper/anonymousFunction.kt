package deeper

fun operator3(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun main(args: Array<String>) {
    operator3(1, 2, fun (n1: Int, n2: Int): Int {
        return n1 + n2
    })
}
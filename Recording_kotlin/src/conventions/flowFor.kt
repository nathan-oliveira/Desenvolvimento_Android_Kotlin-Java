fun main() {
    val str = "Nathan Oliveira";

    for (c in str) {
        print("$c");
    }

    for (i in 1..100) {
        print("$i ");
    }

    for (i in 1..100 step 5) {
        print("$i "); // 0 5 10 15 20 25 30 ... 95 100
    }

    for (i in 100 downTo 0) {
        print("$i "); // 100 99 98 97 96 95 94 ... 3 2 1 0
    }

}
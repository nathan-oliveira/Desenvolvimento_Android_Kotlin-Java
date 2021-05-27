package moreclasses

class Car(val model: String, val maxSpeed: Int) {
    var currentSpeed: Int = 0
        set(value) {
            if (value > maxSpeed) {
                throw Exception("Velocidade maior que a permitida")
            } else {
               field = value
            }
        }
        /*get() {
            return field
        }*/
}

fun main(args: Array<String>) {
    val c1 = Car("", 220)
}
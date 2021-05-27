package moreclasses

// open class Result { // metodo "open" é "public"
sealed class Result { // metodo "sealed" é "private"
    class Success(val message: String) : Result()
    class Error(val message: String, val errorCode: Int) : Result()
}

class Repo () {
    fun execute(): Result {
        return Result.Success("Deu certo")
        //return Result.Error("Deu erro!", 404)
    }
}

fun main(args: Array<String>) {
    val r1 = Repo()
    val result: Result = r1.execute()

    when (result) {
        is Result.Success -> {
            println("Deu sucesso!")
        }
        is Result.Error -> {
            println("Deu erro!")
        }
    }
}
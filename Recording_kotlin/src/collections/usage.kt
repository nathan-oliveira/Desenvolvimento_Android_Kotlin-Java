package collections

data class Ingredients(val name: String, val quantity: Int)
data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

fun main(args: Array<String>) {

    val data = listOf(
        Food("Lasanha", 1200.0,
            listOf(Ingredients("Farinha", 1),
                Ingredients("Presunto", 5),
                Ingredients("Queijo", 10),
                Ingredients("Molho de tomate", 2),
                Ingredients("Manjerição", 2)
            )
        ),
        Food("Panqueca", 500.0),
        Food("Omelete", 200.0),
        Food("Parmegiana", 700.0),
        Food("Sopa de feijão", 300.0),
        Food("Hamburguer", 2000.0,
            listOf(Ingredients("Pão",1),
                Ingredients("Hamburguer",3),
                Ingredients("Queijo",1),
                Ingredients("Catupiry", 1),
                Ingredients("Bacon", 1),
                Ingredients("Alface", 1),
                Ingredients("Tomate", 1)
            )
        )
    )
//** Tenho receitas na lista? **
    //println(data.size > 0)
    println("Tenho receitas na lista? ${if (data.any()) "Sim" else "Não"}.")

//** Quantas receitas tenho na coleção? **
    println("Quantas receitas tenho na coleção? ${data.count()} receitas")

//** Qual a primeira e última receita? **
    println("A primeira receita é: ${data.first().name}") //data[0]
    println("A última receita é: ${data.last().name}")

//** Qual a soma de calorias? **
    val sum = data.sumByDouble { it.calories } // "it" é a mesmo coisa que o "this" no javascript | "it" está se referindo ao proprio objeto "data"
    println("Qual a soma de calorias? $sum")
    // listOf(1, 3, 5, 3, 2).sum()
    /*
    var sum: Int = 0;
    for(d in data) {
        sum += d.calories.toInt();
    }
    */

//** Me dê as duas primeiras receitas? **
    val firstTwo = data.take(2)
    for (f in firstTwo.withIndex()) {
        println("index: ${f.index + 1} - value: ${f.value.name}")
    }

//** Sei como fazer panqueca? E sushi? **
    val knowPancake = data.filter { it.name == "Panqueca" }.any()
    println("Sei como fazer panqueca? ${if (knowPancake) "Sim" else "Não"}")
    val knowSushi = data.filter { it.name == "Sushi" }.any()
    println("Sei como fazer sushi? ${if (knowSushi) "Sim" else "Não"}")


//** Quais são as comidas com mais de 500 calorias? **
    val more500 = data.filter { it.calories > 500 }.forEach { println(it.name) }

//** Pair (chave. valor) de comidas com mais de 500 calorias (name, calories)? **
    data.filter { it.calories > 500 }
        .map { Pair(it.name, it.calories) }
        .forEach { println("${it.first}: ${it.second} calorias.") }

//** Quais das receitas possui farinha com ingredientes?
    //    fun hasIgredients(list: List<Ingredients>, name: String): Boolean {
    //        return list.filter { it.name == name }.any()
    //    }

    fun hasIgredients(list: List<Ingredients>, name: String) = list.filter { it.name == name }.any()

    val result = data
        .filter { hasIgredients(it.ingredients, "Farinha") }
        .forEach { println(it.name) }
    //data.filter { it.ingredients.filter { it.name == "Farinha" } }
}


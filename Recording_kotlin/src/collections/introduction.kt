package collections



fun main(args: Array<String>) {

    // List - array, Set, Hashmap

    val lista1 = listOf("Madrid", "São Paulo", "Berlim") // não permite alteração
    val lista2 = mutableListOf("Madrid", "São Paulo", "Berlim")
    lista2.add("Marília")
    //lista2.remove("Marília")

    val array1 = arrayListOf("Madrid", "São Paulo", "Berlim")
    array1.add("Marília")
    array1.remove("São Paulo")

    val set1 = setOf("Madrid", "São Paulo", "Berlim", "Berlim") // impede de elementos repedidos seja inserido - não permite alteração
    println(set1.size) // 3
    val set2 = mutableSetOf("Madrid", "São Paulo", "Berlim")
    //set2.add - remove

    val hash1 = hashMapOf<String, String>(Pair("França", "Paris"), Pair("Brasil", "São Paulo")) // Pair("key", "value")
    // hash1.entries => [França=Paris, Brasil=São Paulo]
    //hash1.entries.add()
    println(hash1["França"])

    val map1 = mapOf(Pair("França", "Paris"), Pair("Brasil", "São Paulo"))
    val map2 = mutableMapOf(Pair("França", "Paris"), Pair("Brasil", "São Paulo"))
    //map2.entries.add()


}
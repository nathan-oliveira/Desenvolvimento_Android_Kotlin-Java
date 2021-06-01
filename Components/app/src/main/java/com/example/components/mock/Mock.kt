package com.example.components.mock

class Mock private constructor() {
    companion object {
        fun getList(): List<String> = listOf("Gramas", "Kg", "Arroba", "Toneladas")
    }
    /*
    object TESTE {
        fun getList(): List<String> = listOf("Gramas", "Kg", "Arroba", "Toneladas")
    }
    */
}

/*
class Mock {
    fun getList(): List<String> = listOf("Gramas", "Kg", "Arroba", "Toneladas")
}
*/
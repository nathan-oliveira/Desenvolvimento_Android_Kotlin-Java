package exercises

fun countVowels(phrase: String): Int {
    val VOLWES = "aeiou";
    var totalVolwes = 0;

    for (letter in phrase) {
        if (letter.toLowerCase() in VOLWES)
            totalVolwes++
    }

    return totalVolwes;
}

fun countConsonants(phrase: String): Int {
    val CONSOLANTES = "bcdfgjklmnpqrstvwxz";
    var totalConsonants = 0;

    for (letter in phrase) {
        if (letter.toLowerCase() in CONSOLANTES)
            totalConsonants++
    }

    return totalConsonants;
}

fun countVolwesFilter(phrase: String) = phrase.filter { it.toLowerCase() in "aeiou" }.length
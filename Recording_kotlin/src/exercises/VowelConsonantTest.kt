package exercises

import org.junit.Assert
import org.junit.Test

class VowelConsonantTest {
    @Test fun countVowels() {
        Assert.assertEquals(11, countVowels("Quantas vogais tem esta frase?"))
    }

    @Test fun countConsonants() {
        Assert.assertEquals(21, countConsonants("Geralmente uma frase possui mais consoantes!"))
    }

    @Test fun countVowelsAndConsonants() {
        var phrase = "Estou gostando muito de aprender koltin!";
        Assert.assertEquals(15, countVowels(phrase))
        Assert.assertEquals(19, countVowels(phrase))
    }

    @Test fun countVowelsFilter() {
        Assert.assertEquals(8, countVolwesFilter("Minha frase com vogais!"))
    }
}
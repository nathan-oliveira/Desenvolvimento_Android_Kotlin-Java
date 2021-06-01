package com.example.motivation.mock

import com.example.motivation.util.MotivationConstants
import java.util.*

class Phrase(val description: String, val category: Int)

fun Int.random(): Int = Random().nextInt(this)

class Mock {
    private val ALL = MotivationConstants.PHRASE_FILTER.ALL
    private val SUN = MotivationConstants.PHRASE_FILTER.SUN
    private val HAPPY = MotivationConstants.PHRASE_FILTER.HAPPY

    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Lorem ipsum dolor sit amet, consectetur adipiscing elit", HAPPY),
        Phrase("Proin congue lobortis turpis eu bibendum", HAPPY),
        Phrase("Donec et elementum nibh", HAPPY),
        Phrase("Nam sed mi tristique, pharetra quam ut, pretium libero", HAPPY),
        Phrase("In imperdiet dui non eros tempor ultricies eget vel nunc", HAPPY),
        Phrase("In tristique ultrices lectus, ac ultrices justo lobortis non", HAPPY),
        Phrase("Aliquam viverra vitae nibh a vehicula", HAPPY),
        Phrase("Quisque quam diam, tincidunt ac dignissim quis, feugiat at lorem", SUN),
        Phrase("Sed vitae dolor eu libero mattis condimentum eu at ante", SUN),
        Phrase("Suspendisse potenti", SUN),
        Phrase("Mauris volutpat elit volutpat, mattis augue sed, placerat quam", SUN),
        Phrase("Integer finibus vulputate quam, porttitor pretium nisl eleifend non", SUN),
        Phrase("Proin eu massa tincidunt, vestibulum risus non, malesuada sem", SUN),
        Phrase("Pellentesque suscipit nisi magna, in facilisis mi vehicula a. Sed at erat dui", SUN)
    )

    fun getPhrase(value: Int): String {
        val filtered = mListPhrases.filter { it -> (it.category == value || value == ALL) }
        val rand = filtered.size.random()
        return filtered[rand].description
    }
}

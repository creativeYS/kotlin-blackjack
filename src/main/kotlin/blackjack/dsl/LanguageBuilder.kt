package blackjack.dsl

class LanguageBuilder {
    private val levels: MutableList<Language> = mutableListOf()

    infix fun String.level(level: Int) {
        levels.add(Language(this, level))
    }

    fun build(): List<Language> {
        return levels
    }
}

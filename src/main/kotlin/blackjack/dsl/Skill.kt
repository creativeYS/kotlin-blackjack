package blackjack.dsl

data class Skill(val name: String, val type: TYPE) {
    enum class TYPE {
        HARD,
        SOFT
    }
}

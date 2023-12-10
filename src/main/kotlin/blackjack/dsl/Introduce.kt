package blackjack.dsl

fun introduce(builder: PersonBuilder.() -> Unit): Person {
    return PersonBuilder().apply(builder).build()
}

fun skills(builder: SkillBuilder.() -> Unit): List<Skill> {
    return SkillBuilder().apply(builder).build()
}

fun languages(builder: LanguageBuilder.() -> Unit): List<Language> {
    return LanguageBuilder().apply(builder).build()
}

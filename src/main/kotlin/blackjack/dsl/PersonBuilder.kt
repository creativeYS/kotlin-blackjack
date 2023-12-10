package blackjack.dsl

class PersonBuilder {
    private lateinit var name: String
    private var company: String? = null
    private var skills: List<Skill> = emptyList()
    private var languages: List<Language> = emptyList()

    fun name(value: String) {
        name = value
    }

    fun company(value: String) {
        company = value
    }

    fun skills(builder: SkillBuilder.() -> Unit) {
        skills = SkillBuilder().apply(builder).build()
    }

    fun languages(builder: LanguageBuilder.() -> Unit) {
        languages = LanguageBuilder().apply(builder).build()
    }

    fun build(): Person {
        return Person(name, company, skills, languages)
    }
}

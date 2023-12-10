package blackjack.dsl

class SkillBuilder {
    private val skills: MutableList<Skill> = mutableListOf()

    fun soft(value: String) {
        skills.add(Skill(value, Skill.TYPE.SOFT))
    }

    fun hard(value: String) {
        skills.add(Skill(value, Skill.TYPE.HARD))
    }

    fun build(): List<Skill> {
        return skills
    }
}

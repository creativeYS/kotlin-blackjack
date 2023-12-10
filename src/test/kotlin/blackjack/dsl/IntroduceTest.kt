package blackjack.dsl

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class IntroduceTest : FunSpec({
    /*
    introduce {
      name("원동재")
      company("마이다스아이티")
      skills {
        soft("A passion for problem solving")
        soft("Good communication skills")
        hard("Kotlin")
      }
      languages {
        "Korean" level 5
        "English" level 3
      }
    }
     */
    test("person builder") {
        val person = introduce {
            name("Daniel")
            company("Midas IT")
            skills {
                soft("A passion for problem solving")
                soft("Good communication skills")
                hard("Kotlin")
            }
            languages {
                "Korean" level 5
                "English" level 3
            }
        }
        person.name shouldBe "Daniel"
        person.company shouldBe "Midas IT"
        person.skills shouldBe listOf(
            Skill("A passion for problem solving", Skill.TYPE.SOFT),
            Skill("Good communication skills", Skill.TYPE.SOFT),
            Skill("Kotlin", Skill.TYPE.HARD)
        )
        person.languages shouldBe listOf(
            Language("Korean", 5),
            Language("English", 3)
        )
    }

    test("skill builder") {
        val skills = skills {
            soft("A passion for problem solving")
            soft("Good communication skills")
            hard("Kotlin")
        }
        skills shouldBe listOf(
            Skill("A passion for problem solving", Skill.TYPE.SOFT),
            Skill("Good communication skills", Skill.TYPE.SOFT),
            Skill("Kotlin", Skill.TYPE.HARD)
        )
    }

    test("language builder") {
        val languages = languages {
            "Korean" level 5
            "English" level 3
        }
        languages shouldBe listOf(
            Language("Korean", 5),
            Language("English", 3)
        )
    }
})

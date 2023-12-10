package blackjack.dsl

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class DslPractiveTest : FunSpec({
    test("확장 함수") {
        "midas it".containsMidas() shouldBe true
        "midas in".containsMidas() shouldBe true
        "yongsu kim".containsMidas() shouldBe false
        "hello world".containsMidas() shouldBe false
    }

    test("중위 표기") {
        "peter" withPrefix "hello" shouldBe "hello peter"
        "daniel" withPrefix "hello" shouldBe "hello daniel"
    }

    test("산자 오버로딩") {
        val result = "abc" * "cd"
        result shouldBe "ac ad bc bd cc cd"
    }

    test("get 메서드에 대한 관례") {
        val superString = SuperString("hello world")
        superString.get(0) shouldBe "hello"
        superString.get(1) shouldBe "world"
    }

    test("람다를 괄호 밖으로 빼내는 관례") {
        val superString = SuperString("daniel.")
        superString.withPrefix { "hello" } shouldBe "hello daniel."
        val helloGenerator = { "hi" }
        superString.withPrefix(helloGenerator) shouldBe "hi daniel."
    }

    test("수신객체 지정 람다") {
        val result = SuperString("world")
        val sb = StringBuilder()
        sb.apply {
            this.append(result.withPrefix { "hello" })
            append(" daniel")
        }
        sb.toString() shouldBe "hello world daniel"
    }
})

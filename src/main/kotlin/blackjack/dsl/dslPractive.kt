package blackjack.dsl

fun String.containsMidas(): Boolean {
    return this.contains("midas")
}

infix fun String.withPrefix(prefix: String): String {
    return "$prefix $this"
}

operator fun String.times(other: String): String {
    val result = mutableListOf<String>()
    this.forEach { first ->
        other.forEach { second ->
            result.add("$first$second")
        }
    }
    return result.joinToString(" ")
}

class SuperString(private val str: String) {
    fun get(index: Int): String {
        return str.split(" ")[index]
    }

    fun withPrefix(prefix: () -> String): String {
        return "${prefix()} ${this.str}"
    }
}

package blackjack

fun main() {
    val ddd = List<Int>(10) { 1 }
    ddd good 3
}

infix fun List<Int>.good(value: Int): Boolean {
    return this.contains(value)
}

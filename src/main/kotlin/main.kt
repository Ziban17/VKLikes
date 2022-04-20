fun main() {
    val likes = 10
    val people = if (likes % 10 == 1) "человеку" else "людям"
    println("Понравилось $likes $people")
}
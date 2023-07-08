package extensions


open class Dogo
class Aussie: Dogo()

fun Dogo.getBreed() = "Dog"
fun Aussie.getBreed() = "Aussie :3"

fun printBreed(s: Dogo) {
    println(s.getBreed())
}

fun printBreed(s: Aussie) {
    println(s.getBreed())
}


fun main() {
    println(Dogo().getBreed())
    println(Aussie().getBreed())
    printBreed(Dogo())
    printBreed(Aussie())
}

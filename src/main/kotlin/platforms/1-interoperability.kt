package platforms

import java.io.IOException

fun main() {
    val invocation = SuperCoolExtraGreatClassFromJava()

    val int = invocation.randomInt

    val nothing = invocation.simplyDoNothing()

    try {
        invocation.performIOOperation()
    } catch (e: IOException) {
        println(e)
    }
}

package extensions

val String.lastLetter: Char
    get() = this.last()

val <T> MutableList<T>.middleElement: T
    get() = this[size / 2]
//    set(value) {
//        this[size / 2] = value
//        field = value
//    }

/*
Extension properties does not work with backing fields as they are not a part of extended class
(backing field - intermediate field/value generated for a property that uses default implementation, just to work in JVM world)
*/

class CoolExample<T>(var values: MutableList<T>) {

    var middleElement: T = values[values.size / 2]
        get() = values[values.size / 2]
        set(XD) {
            values[values.size / 2] = XD
            field = XD
        }
}

fun main() {
    println("Spanko".lastLetter)
    println(mutableListOf(1, 2, 3, 4, 5).middleElement)

//    mutableListOf(1,2).middleElement = 2

    val a = CoolExample(mutableListOf(1,2))
    a.middleElement = 10
    println(a.middleElement)
    println(a.values)
}

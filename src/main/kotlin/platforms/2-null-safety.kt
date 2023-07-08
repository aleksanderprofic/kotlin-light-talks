package platforms

fun main() {
    val amazingProvider = WowThisIsAlsoAGreatClass()
    val list = amazingProvider.constructList()

    // T - for not null values
    // T? - it can be null, but also a type value
    // T! - T or T?
    // Example 1: (Mutable)Collection<T>!
    //      Java collection of T may be mutable or not, may be nullable or not
    //
    // Example 2: Array<(out) T>!
    //      Java array of T (or a subtype of T), nullable or not

    for (el in list) {
        println(el.lowercase())
    }

//     val dummy = amazingProvider.dummyValue
//     val dummy: String = amazingProvider.dummyValue

}

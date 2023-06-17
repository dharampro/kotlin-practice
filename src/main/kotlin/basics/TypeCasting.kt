package basics

fun main(args: Array<String>) {

    val val1: Any=190
    val val2: String = "";
    if (val1 !is Long) {
        val va: Int? = val1 as? Int
        println(va)
    }
    val test: Any =16677;

    println(test.toString())
}
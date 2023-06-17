package basics

typealias UserSet = Set<User>

class TypeAlias {
}

class User(var id: Int, var name: String) {

}

fun main(args: Array<String>) {
    val set: UserSet = HashSet()
}
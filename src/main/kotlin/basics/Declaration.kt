package basics

// val and var are two ways of declaration, where val for constants works as final in java and var allows to change value
class Declaration

class Employee(var id: Int, var name: String)

fun main(args: Array<String>) {

    val hello = 0
//    Below line will show error, as it is a val and it is declared as wel as assigned once before
//    hello = 100

//    Same applies for objects
    var emp = Employee(1, "Dharam")
    var id: Int = emp.id;
    println("$id")
    emp = Employee(12, "")
    val id2: Int = emp.id
    println("$id2")
}
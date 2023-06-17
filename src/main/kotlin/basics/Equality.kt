package basics;

public class Equality {
}


class Emp(var id: Int, var name: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Emp

        if (id != other.id) return false
        return name == other.name
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        return result
    }

    override fun toString(): String {
        return "Emp(id=$id, name='$name')"
    }

}

fun main() {
    val emp0 = Emp(1, "John")
    val emp1 = emp0;

    val emp2 = Emp(2, "Doe")
    val emp3 = Emp(2, "Doe")

    println(emp0)
    println(emp1)
    println(emp2)
    println(emp3)

//    Do deep comparison return true as both are same objects by reference and value
    println(emp0 == emp1)
    println(emp0.equals(emp1))

//    Returns false as both are different objects with different values
    println(emp1 == emp2)

//    in this case as well kotlin do deep comparison not referential check
    println(emp2 == emp3)
    println(emp2.equals(emp3))

//    Referential checks
    println(emp0 === emp1)
    println(emp2 === emp3)
}
open class classA (
    val a: Int,
    val b: Int
) {
    open fun add() = a + b
//    fun add(a: Int, b: Int): Int{
//        val sum = a + b
//        return sum
//    }
}

class classB(a: Int, b:Int, val c:Int) : classA(a, b)
{
    fun multiply()= a * b * c
//    fun multiply():Int{
//        val product = a * b * c
//        return product
//    }

    fun divide(){
        println("Divide a by c ${a / c}")
        println("Divide b by c ${b / c}")
//        val quotient = (a + b) / c
//        return quotient
    }

    // What if we want to override the add method in the base class.
    // We must add the keywords "open" in the base class method (add)
    // and "override" in the derived class method (add).
    override fun add()=  a + b + c
}

fun main(){

    val b = classB(12, 23, 4)
    println("Multiplication ${b.multiply()}")
    println("Division ${b.divide()}")
    println("Addition ${b.add()}")

}
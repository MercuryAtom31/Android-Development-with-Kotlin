import java.util.Scanner

//class constructortesting (var variable1:Int, var variable2: Int, val variable3: Int = 34)
class constructortesting{

//    init {
//        println("The INIT SECTION: The variable one is $variable1 and variable two is $variable2")
//        println("The third value is $variable3")
//    }

    //Secondary constructor.
    constructor(variable1: Double,variable2: Double){
        println("The INIT SECTION: The variable one is $variable1 and variable two is $variable2")
        println("The addiiton is ${variable1 + variable2}")
    }

    constructor(variable1: Int,variable2: Double){
        println("The INIT SECTION: The variable one is $variable1 and variable two is $variable2")
        println("The addiiton is ${variable1 + variable2}")
    }

    fun addition(variable1: Double, variable2: Double){
        println("The addiiton is ${variable1 + variable2}")
    }
    //Print the values we are passing.
//    fun printValues(){
//        println("The variable one is $variable1 and variable two is $variable2")
//    }
//    fun addition()=variable1 + variable2 + variable3
//    fun multiplication()=variable1 * variable2 * variable3
}

class constructortesting2(var variable4: Double, var variable5: Double){
    fun add()= variable4 + variable5
    fun multiply()= variable4 * variable5

}

fun main(args:Array<String>){

//    val reader3 = Scanner(System.`in`)
//
//    println("Please enter the first number")
//    val userNum1 = reader3.nextDouble()
//    println("Please enter the second number")
//    val userNum2 = reader3.nextDouble()
//
//    //Initialize the class instance
//    val add = constructortesting2(userNum1, userNum2)
//    println(add.add())
//    println(add.multiply())

    /*
    println("Addition")
    println(add.addition())
    println("Multiplication")
    println(add.multiplication())
    println("Print function")
    add.printValues()
    *
     */
}
package Assignments

/*
Create an abstract class which will have two abstract methods, addition and
multiplication. Create another class which will inherit the abstract class.

This new class will have a secondary constructor with two values. Take input from
users inside the main function and send them to the class using constructor. Print
the result of the addition and multiplication operation.
 */

// Abstract class with two abstract methods
abstract class abstractClassPractice {

    abstract fun add(num1: Int, num2: Int): Int
    abstract fun multiply(num1: Int, num2: Int): Int

}
// Class inheriting from the abstract class
class classInheritingFromTheAbstractClass : abstractClassPractice {

    // Secondary constructor taking two values
    constructor(value1: Int, value2: Int) {
        val sum = add(value1, value2)
        val product = multiply(value1, value2)

        // Printing the results
        println("Addition Result: $sum")
        println("Multiplication Result: $product")
    }

    // Implementation of the add method
    override fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    // Implementation of the multiply method
    override fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

fun main() {
    // Taking input from users
    println("Enter the first number:")
    val input1 = readLine()?.toInt() ?: 0

    println("Enter the second number:")
    val input2 = readLine()?.toInt() ?: 0

    // Creating an instance of the subclass using the secondary constructor
    val calculatorInstance = classInheritingFromTheAbstractClass(input1, input2)
}
class primary_secondaryConstructor (val variable1: Int, variable2: Int){

    init {
        println("Addition result ${variable1 + variable2}")
    }

    constructor(variable1: Int, variable2: Int,
                 variable3: Double, variable4: Double)
            : this(variable1, variable2){
        println("Secondary construtor")
        println("Addition values: ${variable3 + variable4}")
    }

    constructor(variable1: Double, variable2: Double,
                variable3: Double, variable4: Double)
            : this(variable1.toInt(), variable2.toInt()){
        println("Third construtor")
        println("Addition values: ${variable1 + variable2}")
    }
}

fun main(args: Array<String>){

    val a = primary_secondaryConstructor(1, 2)
    val b = primary_secondaryConstructor(1, 2, 3.4, 4.5)
    val c = primary_secondaryConstructor(2.5, 3.5, 4.5, 5.6)
}
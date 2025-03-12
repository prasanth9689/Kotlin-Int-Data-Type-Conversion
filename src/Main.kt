//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Conversion from String and Int type is inferred
    val num1 = "500".toInt()

    //Conversion from String and Declaring an Int value immediately
    val num2: Int = "100".toInt()

    val num3: Float = 1000.1000f
    //Conversion from Float
    val num4: Int = num3.toInt()

    val num5: Double = 2000.1000
    //Conversion from Double
    val num6: Int = num5.toInt()

    //Print values after conversion
    println("String to Int : num1 Value : $num1")
    println("String to Int : num2 Value : $num2")
    println("Float Value : num3 Value : $num3")
    println("Float to Int : num4 Value : $num4")
    println("Double Value : num5 Value : $num5")
    println("Double to Int : num6 Value : $num6")
}
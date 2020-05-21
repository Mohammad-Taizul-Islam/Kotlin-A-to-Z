fun main()
{
    val r=Color.Red()
    eval(r)
    val o=Color.Orange()
    eval(o)
}

fun eval(c:Color) =
    when(c){
        is Color.Red -> println("Paint in Red Color")
        is Color.Orange-> println("Paint in Orange Color")
        is Color.Blue-> println("Paint in Blue Color")

        //with out "sealed class" else statement will be compile error with "open class"
        //else-> println("Paint in ant Color")
    }
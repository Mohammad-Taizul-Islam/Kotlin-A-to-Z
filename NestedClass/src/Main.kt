fun main()
{

    val obj=Outer.Nested()
    println(obj.b)
    println(obj.callMe())
}

class Outer{
    val a="Outside Nested class"
    class Nested{
        val b="Inside Nested class"
        fun callMe()="Function calling from inside nested class"
    }
}
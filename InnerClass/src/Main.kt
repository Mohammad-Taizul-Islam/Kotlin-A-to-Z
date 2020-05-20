fun main()
{
    //calling by outer object

    val outer=Outer()
    println("${outer.Nested().callMe()} called by outer object")
    //calling by Inner Nested class object
    val inner=Outer().Nested()
    println("${inner.callMe()} called by Inner Nested object")
}
class Outer{
    val a="I am From Outer Class"
    inner class Nested{
        fun callMe()=a
    }
}
fun main()
{
    var result1=add(4,5)
    var result2=add(4,5,6)
    var result3=add(4,5,6,7)
    println("Result1 : "+result1)
    println("Result2 : "+result2)
    println("Result3 : "+result3)

    println()
    var sum1=add2()
    var sum2=add2(22,33)

    println("Sum1 : "+sum1)
    println("Sum2 : "+sum2)


}

fun add(a:Int,b:Int,c:Int=0,d:Int=0):Int
{
    return a+b+c+d
}

fun add2(a:Int=1,b:Int=1):Int{
    return a+b
}
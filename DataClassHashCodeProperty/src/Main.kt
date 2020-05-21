fun main()
{

    val p1=Person("Juy",24)
    val p2=p1.copy()
    val p3=p1.copy(name = "July")

    println("P1's hash code =${p1.hashCode()}")
    println("P2's hash code =${p2.hashCode()}")
    println("p3's hash code =${p3.hashCode()}")

    if (p1.equals(p2))
    {
        println("P1 is equals to p2")
    }else{
        println("P2 is not equals to P1")
    }

    if(p1.equals(p3))
    {
        println("P1 is equals to P3")
    }else{
        println("P1 is not equals to P3")
    }
}
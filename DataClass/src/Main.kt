fun main()
{
    val p1=Person("Satter",34)

    val p2=p1.copy(name="Sorif")
    println("Person's name : ${p1.name}")
    println("Person's age : ${p1.age}")

    println(p1.toString())

    println("Again")
    println("Person's name : ${p2.name}")
    println("Person's age : ${p2.age}")


}
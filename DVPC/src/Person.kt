class Person(val firstName :String ="Unknown",val personAge :Int=0)
{
    private var name :String
    private val age :Int
    init {
        name=firstName
        age=personAge

        println("Person Name :${name}")
        println("Person Age : ${age}")
    }
}
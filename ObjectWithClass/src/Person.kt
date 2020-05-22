open class Person(name:String,age:Int) {
    init {
        println("Name : $name and Age : $age")
    }
    fun eat()= println("Eating foods")
    fun talk()= println("Talking with peoples")
    open fun work()= println("Working as a doctor")
}
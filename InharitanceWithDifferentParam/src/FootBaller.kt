class FootBaller(name :String,age:Int ,club:String) :Person(name,age) {
    init {
        println("Name of the palyer $name age of $age and play for $club")
    }
    fun playFootball()
    {
        println("I am playing for National team")
    }
}
class Person(var name:String,var age:Int) {
    var profession:String ="Not Mention"

    init {
        println("$name's profile detail held in class object ")
    }
    constructor(name: String,age: Int,profession:String):this(name, age)
    {
        this.profession=profession
    }
    fun personDetail()
    {
        println("$name is a $age years old and whose profession is $profession")
    }
}
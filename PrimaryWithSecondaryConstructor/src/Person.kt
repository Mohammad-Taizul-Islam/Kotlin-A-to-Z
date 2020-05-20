class Person(var name:String,var age:Int) {
    var profession:String="Unknown"
    constructor(name: String,age: Int,profession:String):this(name, age)
    {
        this.profession=profession
    }

    fun personDetail()
    {
        println("$name Whose profession is $profession and age $age years old ")
    }
}
class Person(val name :String,var age:Int) {
    private var firstName :String =name
    private var personAge:Int=age

    init {
       // firstName=name
        //personAge=age

        println("Person Name : ${firstName}")
        println("Person Age : ${personAge}")
    }

}
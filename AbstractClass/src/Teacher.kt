class Teacher(name:String) :Person(name){
    override fun displayJob(description:String) {
        println(description)
    }
}
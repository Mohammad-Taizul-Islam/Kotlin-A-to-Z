fun main()
{
    //object with class constructor

    val social_worker=object :Person("Arif",29){
        override fun work() = println("He is working as a social worker")
    }
    social_worker.eat()
    social_worker.talk()
    social_worker.work()

}
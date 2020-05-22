fun main()
{
    val social_worker=object :Person(){
        override fun work() = println("I am working as a social worker")
    }
    social_worker.eat()
    social_worker.talk()
    social_worker.work()
}
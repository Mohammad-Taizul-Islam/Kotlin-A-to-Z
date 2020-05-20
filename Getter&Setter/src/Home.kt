fun main()
{

    val p1=Person()
    p1._personName="Jue"
    println("Person name ${p1._personName}")

    val maria=Girl()
    maria.age=15
    maria.actualAge=15

    println("Maria's actual age :${maria.actualAge} & Pretended age : ${maria.age}")

    val skye=Girl()
    skye.age=37
    skye.actualAge=37
    println("Maria's actual age :${skye.actualAge} & Pretended age : ${skye.age}")

}
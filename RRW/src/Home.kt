fun  main() {


    //use of repeat

    println("Checking Repeat")
    repeat(5) {
        println("Hello Yeah")
    }



    println("Checking m..n")
    //use of Range as in
    for (i in 2..4) {
        println(i)
    }


    //use Range of DownTo
    println("Checking downTo")
    for (i in 100 downTo 33) {
        println(i)
    }


    //use Range of until

    println("Checking until")
    for (i in 3 until 9 step 2) {
        println(i)
    }



    //use of when with same type of value
    printDayOfTheWeek(3)
    printDayOfTheWeek(7)
    printDayOfTheWeek(1)


    //use of When with any type of object

    printWeekDay("Fri")
    printWeekDay(4)
    printWeekDay("Thu")

}
    //use of when with same type of value

fun printDayOfTheWeek(n:Int)
{
    when(n)
    {
        1->{
            println("Sunday")
        }
        2->{
            println("Monday")
        }
        3->{
            println("Tuesday")
        }
        4->{
            println("Wednesday")
        }
        5->{
            println("Thursday")
        }
        6->{
            println("Friday")
        }
        7->{
            println("Saturday")
        }
        else->{
            println("Invalid day of the week")
        }
    }
}

//use of When with any type of object

fun printWeekDay(n:Any)
{
    when(n)
    {
        1->{
            println("Sunday")
        }
        "Sun"->{
            println("Sunday")
        }
        2->{
            println("Monday")
        }
        "Mon"->{
            println("Monday")
        }
        3->{
            println("Tuesday")
        }
        "Tue"->{
            println("Tuesday")
        }
        4->{
            println("Wednesday")
        }
        "Wed"->{
            println("Wednesday")
        }
        5->{
            println("Thursday")
        }
        "Thu"->{
            println("Thursday")
        }
        6->{
            println("Friday")
        }
        "Fri"->{
            println("Friday")
        }
        7->{
            println("Saturday")
        }
        "Sat"->{
            println("Saturday")
        }
        else->{
            println("Invalid day of the week")
        }
    }
}

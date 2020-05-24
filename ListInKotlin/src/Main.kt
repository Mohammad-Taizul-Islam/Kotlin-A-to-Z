fun main()
{
    //initialize immutable list
    val listOfFruits= listOf<String>("Apple","Mango","Banana","Grape","Blueberry","Jackfruit","Papaya","Coconut")

    //getting elements by index
    println("Last fruits of list is :"+listOfFruits[7])

    //getting elements by get method

    println("First fruits of the list is :"+listOfFruits.get(0))


    //mutable list initializing

    var listOfAnimal= mutableListOf<String>("Cat","Dog","Monkey","Horse","Tiger","Elephant")
    //adding elements of the oth index of the mutable list
    listOfAnimal.add(0,"Lion")
    //adding element of the last index of the mutable list
    listOfAnimal.add("Panda")

    //list of animal after adding last and first index animal
    println("list of animal after adding last and first index animal :")
    for (animal in listOfAnimal)
    {
        println(animal)
    }


    //Check if List Contains an Element
    var value=listOfAnimal.contains("Deer")
    if(value)
    {
        println("Deer contains listOfAnimals")
    }else{
        println("Deer doesn't contain listOfAnimals")
    }



    //Find Element in List

    var value1=listOfAnimal.find { it.contains("or") }
    println("Searching value is : $value1")


    //Filter Elements of List
    var value2=listOfAnimal.filter { it.contains("o") }
    println("Filtering list of animal by O character")
    print(value2)

}
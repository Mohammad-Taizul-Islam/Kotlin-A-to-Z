fun main()
{
    val operation=ArithmeticOperation.Add(40,50)
    println("The result of adding is ")
    println(execution(operation))
}

fun execution(op : ArithmeticOperation) =when(op)
{
    is ArithmeticOperation.Add ->op.a+op.b
    is ArithmeticOperation.Subtract->op.a-op.b
    is ArithmeticOperation.Multiply->op.a*op.b
    is ArithmeticOperation.Divide->op.a/op.b
}
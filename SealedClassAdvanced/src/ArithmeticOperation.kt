sealed class ArithmeticOperation {
    class Add(val a:Int,val b:Int):ArithmeticOperation()
    class Subtract(val a:Int,val b:Int):ArithmeticOperation()
    class Multiply(val a:Int,val b:Int):ArithmeticOperation()
    class Divide(val a:Int,val b:Int):ArithmeticOperation()
}
open class Log {

    var data:String =" "
    var numberOfData:Int=0

    constructor(_data :String)
    {
        data=_data
    }
    constructor(_data: String ,_numberOfData:Int)
    {
        data=_data
        numberOfData=_numberOfData
        println("$data : $numberOfData times")
    }
}
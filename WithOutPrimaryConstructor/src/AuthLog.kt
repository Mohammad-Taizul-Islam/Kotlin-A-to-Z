class AuthLog :Log {
    constructor(_data :String ) :this("From AuthLog "+_data,10)
    constructor(_data: String,_numberOfData :Int) :super(_data,_numberOfData)
}
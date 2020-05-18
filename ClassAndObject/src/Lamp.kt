class Lamp {
    private var isOn :Boolean =false
    fun turnOn():Boolean
    {
        isOn=true
        return isOn
    }
    fun turnOff() :Boolean
    {
        isOn=false
        return isOn
    }

    fun displayLightStatus(lamp:String)
    {
        if(isOn==true)
        {
            println("$lamp lamp is on")
        }else{
            println("$lamp lamp is off")
        }
    }
}
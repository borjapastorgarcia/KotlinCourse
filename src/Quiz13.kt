fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy", "Sunny", 20))
    println(whatShouldIDoToday("Sad", "Cloudy"))

}

fun whatShouldIDoToday(
    mood : String,
    weather : String = "sunny",
    temperature : Int = 28
) : String {

    return when{
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        mood == "Sad" && weather == "Cloudy" -> "go read"
        else -> "gone"
    }
}
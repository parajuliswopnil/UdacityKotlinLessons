import java.util.*

fun main(args: Array<String>){
    val todaysActivity : String = whatShouldIDoToday("sad")
    println(todaysActivity)
}
fun whatShouldIDoToday(mood : String, weather : String = "sunny", temperature : Int = 36): String{

    return when{
        isHappy(mood)  && isSunny(weather) -> "Go out and enjoy the day."
        isHappy(mood) && isSunny(weather) && isHot(temperature) -> "just stay in your bed"
        isHot(temperature) -> "go swimming"
        else -> "Stay home cook rice."

    }
}
fun isHappy(mood: String): Boolean {
    print("how are you feeling right now? Happy or sad? ")
    val feelings : String? = readLine()
    return feelings == "happy"

}
fun isSunny(weather: String) = weather == "sunny"
fun isHot(temperature: Int) = temperature > 35
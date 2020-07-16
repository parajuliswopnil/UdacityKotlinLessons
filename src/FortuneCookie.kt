fun main(args: Array<String>){
    val fortune : String = getFortuneCookie(getBirthday())
    println(fortune)
}

fun getFortuneCookie(birthdayint : Int): String{
    val fortunes = listOf<String>("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.", "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")
    return when (birthdayint){
        28, 31 -> "You were born too late in the month."
        1,2,3,4,5,6,7 -> "You were born in the first week. So no fortunes for you."
        else -> fortunes.random()
    }



}
fun getBirthday() : Int{
    print("Enter your birthday. ")

    val Birthday : String? = readLine()
    val birthdayint = Birthday?.toIntOrNull() ?: 1
    return(birthdayint)
}
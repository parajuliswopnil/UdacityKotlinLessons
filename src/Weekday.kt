import java.util.*

fun dayOfTheWeek(){
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")

    }

    }
        



fun main(args: Array<String>){
    dayOfTheWeek()
}

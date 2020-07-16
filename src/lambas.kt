import kotlin.random.Random

fun main(args: Array<String>){
    println(rolldice2(0))
}
val rolldice = {sides : Int ->var diceNum : Int
                            if(sides ==0){
                                diceNum = 0
                            }else{
                            val diceNumbers = 1..sides + 1
                            diceNum = diceNumbers.random()
                            }
println(diceNum)}

val rolldice2 : (Int) -> Unit = { sides ->if (sides == 0) 0
    else Random.nextInt(sides)+1
    }

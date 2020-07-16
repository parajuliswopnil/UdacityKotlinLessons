fun main (args: Array<String>){
    val canAddOrNot : Boolean = canAddFish(10, listOf<Int>(2,2,2))
    print(canAddOrNot)
}
fun canAddFish(tankSize : Int, currentFish : List<Int> = listOf<Int>(2,2,2) , fishSize : Int = 2, hasDecorations : Boolean = true ): Boolean{
    var size: Int = 0
    val actualCapacity : Double = tankSize * 0.8
    for(elements in currentFish){
        size += elements
    }
    val totalSize : Int = size + fishSize
    return totalSize <= actualCapacity

}
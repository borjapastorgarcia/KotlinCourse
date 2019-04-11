fun main(args: Array<String>) {
    println(canAddAnotherFishIntoATank(10.0, listOf(3,3,3)))
    println(canAddAnotherFishIntoATank(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddAnotherFishIntoATank(9.0, listOf(1,1,3), 3))
    println(canAddAnotherFishIntoATank(10.0, listOf(), 7, true))

}

fun canAddAnotherFishIntoATank(
    tankSize : Double,
    currentFishes : List<Int>,
    fishSize : Int = 2,
    hasDecorations : Boolean = true
    ) : Boolean {

    val totalSizeCurrentFishes = currentFishes.sum()
    var currentTankSize : Double = 0.0
    if(hasDecorations)
        currentTankSize = (tankSize*80)/100
    return (currentTankSize+totalSizeCurrentFishes)<=tankSize
}
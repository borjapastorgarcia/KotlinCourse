fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    //Create a filter that gets all the curries and sorts them by string length.

    val curries = spices.filter { it.contains("curry") }.sortedBy { it.length }

    //Filter the list of spices to return all the spices that start with 'c' and end in 'e'. Do it in two different ways.
    val spicesStartsCorE=spices.filter {
        it.startsWith('c',false)
            .and(it.endsWith('e',false)
            )}

    //Take the first three elements of the list and return the ones that start with 'c'.
    val threeFirstElements= spices.subList(0,3).filter { it.startsWith('c') }

    //Other option
    // spices.take(3).filter{it.startsWith('c')}
    println(curries)
    println(spicesStartsCorE)
    println(threeFirstElements)
}



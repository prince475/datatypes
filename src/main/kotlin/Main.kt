
fun main(args: Array<String>) {
    // using val and var
    // val defines unchanging variable values
    // var is used to define variables that need to be reassigned values later in our program
    val shoe = 4
    println(shoe)

    // using var and re-assigning values to our defined variables
    var sdft_03 = "hybrid"
    sdft_03 = "remote"
    println(sdft_03)

    var fish: Int =12
    fish = 20
    println(fish)

    // creating a string template using interpolation(+) to join the strings and $ variable name.
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")

    // creating a string template with an expression in it by using curly braces to do it.
    println("I have ${numberOfFish + numberOfPlants} fish and plants")
}


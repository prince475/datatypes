# DATA TYPES, CONTROL FLOW AND ARRAY LISTS

### Initializing a function to write our code inside as we code along. 

fun main(args: Array<String>) {

- arithmetic operations are direct
## using val and var
- val defines unchanging variable values
- var is used to define variables that need to be reassigned values later in our program
  
  
    val shoe = 4
    println(shoe)
  
  
  ## using var and re-assigning values to our defined variables


    var sdft_03 = ("hybrid")
    sdft_03 = ("remote")
    println(sdft_03)


## assigning a datatype to a variable


    var fish: Int = 12
    fish = 20
    println(fish)


## creating a string template using interpolation(+) to join the strings and $ variable name.


    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")


## creating a string template with an expression in it by using curly braces to do it.


     println("I have ${numberOfFish + numberOfPlants} fish and plants")


# comparing conditions and booleans
## writing an if else statement

    var hybridClass = 120
    var remoteClass = 120

    if (hybridClass > remoteClass) {
        println("Assign more Tms to Hybrid")
    } else {
        println(" Balanced student to teacher ratio")
    }

## if else using a range

    val shirts = 10
    if (shirts in 1..100) {
        println(shirts)
    }

## using && == || operands


    if (hybridClass == 0 && remoteClass == 0) {
        println("Moringa is accepting applications for software development classes")
    } else if (hybridClass < 100 || remoteClass < 100) {
        println("Accept more students to the program")
    } else {
        println("Sorry, not taking anymore student applications!! Classes are full.")
    }

## using a when statement instead
  - The 'when' use case is like switch statement in other languages.
  
  
    when (hybridClass) {
        0 -> println("Moringa is accepting applications for software development classes")
        in 1..100 -> println("Accept more students to the program")
        else -> println("Sorry, not taking anymore student applications!! Classes are full.")
    }


# nullability
  - by default variables cannot be null
  - for instance (var rocks: Int = null) this statement will cause an error: null cannot be a value of a non-null type int

  - to indicate that a variable can be null then use a question mark operator ? after the data type, with this done then you can assign a null to it
  
  
    var marbles: Int? = null
  

## using if
    var dogFoodTreats = 10
    if (dogFoodTreats != null) {
        dogFoodTreats = dogFoodTreats.dec()
    }

## using ? in place of if
   - if dogFoodTreat is not null just decrement and use it
   - ?: the elvis operator

    var dogFoodTreats = 10
    dogFoodTreats = dogFoodTreats?.dec() ?: 0
    chaining ?: operator on to our null statement which states that if the value is null, then use the value 0 and evaluation is stopped and dec method is not called

#  Making array, lists and loops
   -  list are a fundamental type in Kotlin and are similar to lists in other languages
   -  Declaring a list using listOf
   -  listOf cannot be changed
   
   
    val school = listOf("Moringa", "Strathmore")
    println(school)
   


## declaring a list that can be changed using mutableListOf
### Removing an item using the remove() method which will return true when it successfully removes an item
    val myList = mutableListOf("Tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)

# creating arrays
   - arrays in kotlin don't have mutable versions. once an array is created it size will remain fixed.
   - This also means you can't add or remove elements, except by copying to a new array.
   - rules of val and var are the same with arrays as with lists.
   - with arrays defined with val, you can't change which array the variable refers to, but you can still change the contents of the array
   - we usually declare an array of strings using arrayOf. Use the java.util.Arrays.toString() array utility to print it out.
   
    val schoolOfFish = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(schoolOfFish))

   - an array declared with arrayOf doesn't have a type associated with the elements which allows us to mix types.
    
    val mixedTypes = arrayOf("Prince", 2)
    println(java.util.Arrays.toString(mixedTypes))

   - You can also declare arrays with one type for all the elements.
   - declaring an array of integers using intArrayOf()
    
    val age = intArrayOf(1, 10, 40)
    println(java.util.Arrays.toString(age))

## Combine two arrays with the + operator
    
    val numbers = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers
    println(foo2[3])
    println(java.util.Arrays.toString(foo2))

### Trying out different combinations nested arrays and lists. As in other languages, you can nest arrays and lists.
   - That is, when you put an array within an array of arrays-not a flattened array of the contents of the two.
   - Elements of an array can also be lists, and the elements lists can be arrays

    val num = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(num, oceans, "Tiger")
    println(oddList[1])

### Kotlin allows you to utilize arrays with code instead of initialing them to 0.

    val array = Array(5) { it * 2 }
    println(java.util.Arrays.toString(array))
   - the initialization code is between the curly braces {}. 'it' refers to the array index starting with 0

  # Making loops
    
 ## Using a for loop
    
    val schools = arrayOf("shark", "salmon", "minnow")
    for (element in schools) {
        println(element + " ")
    }

   - You can loop through the elements and the indexes at the same time.
   
    for ((index, element) in schools.withIndex()) {
        println("Item at $index is $element\n")
    }

   - looking at different step sizes and ranges
   - specifying ranges of numbers or characters, alphabetically and being able to specify backward using downTo
   
    for (i in 1..5) println(i)
    for (i in 5 downTo 1) print(i)
    for (i in 3..6 step 2) println(i)
    for (i in 'd'..'g') println(i)

   - using while loops, do...while loops and ++ and -- operators.
   - repeat loops are also available
   
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }

    
# In Summary
    - Kotlin types can't be implicitly converted—use casting.
    - Variables declared with val can only be assigned once.
    - Kotlin variables are not nullable by default. Use ? to make variables nullable.
    - With Kotlin, you can loop through the index and elements of an array at the same time in a for loop.
    - Arrays and lists can have a single type or mixed types.
    - Arrays and lists can be nested.
    - You can create loops with for, while, do/while, and repeat.
    - The when statement is Kotlin's version of the switch statement, but when is more flexible.


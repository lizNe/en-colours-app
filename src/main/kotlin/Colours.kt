
class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String> {

        return colours
    }

    fun numberOfColours (): Int{

        return colours.count()
    }


//    returns the first element in the list
    fun firstColour() : String{
        return colours.first()
    }


//    returns the last element in the list
    fun lastColour() : String{
        //TODO return the last colour list
        return colours.last()
    }

    fun coloursInAlphabeticOrder() : List<String>{
        return colours.sorted()
    }

    fun coloursInAllCapitals() : List<String> {
        return colours.map { it.uppercase() }
    }

//    The function has a parameter (letter) passed into it that contains the variable type Char and returns a List of Strings
    fun coloursStartingWithLetter(letter: Char) : List<String>{
       return colours.filter{it.startsWith('B')}

    }

//    Reference: https://kotlinlang.org/docs/constructing-collections.html#invoke-functions-on-other-collections
//    This function has a parameter size passed into it with type int and will return a List of strings

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        val largerThan6 = colours.filter { it.length >= 6 }
        return (largerThan6)
    }

//     Reference: https://kotlinlang.org/docs/constructing-collections.html#invoke-functions-on-other-collections
    fun coloursWithLessCharsThan(size: Int) : List<String>{
        val lessThan6 = colours.filter { it.length < 6 }
        return (lessThan6)
    }


//   ignoreCase ignores the case sensitivity of the word blue

    fun isColourInTheList(colour: String): Boolean {
        return colour.equals("BLUe", true)
    }

    fun forEachColour(){
        for (colour in colours){
            println("Colour: $colour")
        }
    }

    fun coloursInDescendingOrder() : List<String>{
        return colours.sortedDescending()
    }

//    Reference https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/each-count.html
//    returns a map that associates the key of each group(Char) with the count of that element in each group(int)

    fun countOccurrenceFirstLetter(): Map<Char, Int> {
        return colours.groupingBy { it.first() }.eachCount()

    }

    fun coloursInAllLower() : List<String> {
        return colours.map { it.lowercase() }
    }

}
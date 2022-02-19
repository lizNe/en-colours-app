import java.util.*

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

    fun coloursStartingWithLetter(letter: Char) : List<String>{
       return colours.filter{it.startsWith('B')}

    }

    /* Reference: https://kotlinlang.org/docs/constructing-collections.html#invoke-functions-on-other-collections */
    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        val largerThan6 = colours.filter { it.length >= 6 }
        return (largerThan6)
    }

    /* Reference: https://kotlinlang.org/docs/constructing-collections.html#invoke-functions-on-other-collections */
    fun coloursWithLessCharsThan(size: Int) : List<String>{
        val lessThan6 = colours.filter { it.length < 6 }
        return (lessThan6)
    }

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

    /* Reference https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/each-count.html */
    fun countOccurrenceFirstLetter(): Map<Char, Int> {
        return colours.groupingBy { it.first() }.eachCount()

    }

    fun coloursInAllLower() : List<String> {
        return colours.map { it.lowercase(Locale.getDefault()) }
    }







    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

}
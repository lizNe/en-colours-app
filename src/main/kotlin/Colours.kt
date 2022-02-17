class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String> {

        return colours
    }

    fun numberOfColours (): Int{

        return colours.count()
    }

    fun firstColour() : String{
        //TODO return the first colour in the list
        return colours.first()
    }

    fun lastColour() : String{
        //TODO return the last colour list
        return colours.last()
    }

    fun coloursInAlphabeticOrder() : List<String>{
        return colours.sorted()
    }

    fun coloursInAllCapitals() : List<String> {
        return colours.map { it.toUpperCase() }
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
       return colours.filter{it.startsWith('B')}

    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{

}

    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return listOf("this should return colours less than ${size} chars")
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        return false
    }

    fun add(colours: Colours) {

    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

}
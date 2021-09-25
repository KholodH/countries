import com.sun.source.tree.WhileLoopTree
import java.util.Collections.shuffle
import kotlin.random.Random

fun main(){
    //Create a Country class with two attributes (name, capital)
    class Country(val cname:String, val capital:String){
    //Create a function that prints the country and its capital

        fun print(){
            println("the country is $cname and it's capital is $capital")
        }
    }

    val Game= listOf<Country>(
        Country("Japan","tokyo") ,
        Country("Saudi Arabia","Riyadh"),
        Country("France","paris") ,
        Country("United kingdom","london"),
        Country("Korea","seul") ,
        Country("Spin","madrid"),
        Country("Grace","athina") ,
        Country("Italy","roma"),
        Country("Turkey","ankra") ,
        Country("Egypt","cairo")
    )
    //Randomly select three countries and quiz the user to see if they know the capitals
    var count=0
    var grade=0
    while(true){

        val choice = (Game[Random.nextInt(Game.size)]).apply {
            shuffle(Game)
        }
        print("guess the capital for this country ${choice.cname}: ")
        count++
       val answer= readLine()!!.uppercase()
        if (answer ==choice.capital.uppercase()){
            println("correct")
            grade++}
        else{
            println("false the right answer was : ${choice.capital}")
            grade--
            }

        if (count == 3){
            println("Do you want to complete playing? (Y/N)")
            val compale= readLine()!!.uppercase()
            if (compale == "Y")
            count=0

            else{

            println("Your total score is: $grade")
            break

        }}
    }}
//If the user guesses incorrectly call the capital function to show the answer
//Give the user a final score out of 3 at the end of the game
//Start a new game if they want to play again

//Bonus:
//
//Can you find a way to always ask 3 unique questions? (Never repeating the same country in a single game)






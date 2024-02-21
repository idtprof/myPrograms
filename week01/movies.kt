
fun checkAge (a: Int) {
    if (a > 17)
        println("You may see this movie!")
    if (a < 17)
        println("You may see this movie!")
}

fun main(args: Array<String>) {
    println ("Please enter your age: ")

    var userAge: Int
    var movieInput: Int

    val input = readLine()
    var userAge = input.toInt()

    println ("Please enter 1 for G rated movie," +
            " 2 for PG, 3 for PG-13," +
            " and 4 for rated R.")
    val movieRating = readLine()
    var movieInput = input.toInt()

    if (movieInput == 1)
        println ("You may see this movie!")
    else if (movieInput == 4 && userAge < 17 )
        println ("You may not see this movie.")
    else if (movieInput == 3 && userAge < 13)
        println ("You may not see this movie.")
    else
        checkAge(userAge)
}
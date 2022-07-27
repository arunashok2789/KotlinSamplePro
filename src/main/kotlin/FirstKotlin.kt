class FirstKotlin

fun main() {
    var x = 2
    val a = 9
    val b = 2
    var y = if (a > b) 11 else 2
    var list = mutableListOf<String>("aa", "bb", "cc")
    println("Hi arun from kotlin ${list.get(0)}")
    println("print y value $y")
    for(number in 1..100){
        print("\n print the numbers $number")

        var x = when(2*3){
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6 -> "six"
            else -> {"nothing"}
        }
        println("the value of x is ...$x")
    }


}

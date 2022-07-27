class Functions(override var x: Int, override var y: Int) :TestSealed("5"),SampleInterface{
    // To check extensive functions and default parameter value
    fun printNumbers(){
        for(i in 1..10){
            println("Numbers are ...$i")
        }
    }

    override fun testSample() {
        println("overrided fun sample $x...$y")
    }

}
fun main() {
    var funcs : Functions = Functions(7,8)
    funcs.printNumbers()
    funcs.testSample()
}



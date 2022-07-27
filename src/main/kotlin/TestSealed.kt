 sealed class TestSealed(s: String) {
    val value1 = 5

     init {
         println("This is from class TestSealed $value1")
     }
}
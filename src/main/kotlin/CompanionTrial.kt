class CompanionTrial {
    companion object Test1 {
        var someInteger: Int = 10
    }
}

fun main(){
    println("The integer value is...${CompanionTrial.Test1.someInteger}")
}
fun main(args: Array<String>) {
    for(i in 1..10 step 2){
        print("$i ")
    }
    println()
    for(i in 1..10){
        print("$i ")
    }
    println()
    for(i in 1 until 10){
        print("$i ")
    }
    println()
    val arr = listOf("Java", "Kotlin", "C", "C++", "Javascript")
    for(i in arr){
        print("$i ")
    }
}
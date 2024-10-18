fun Thuong2(a:Int, b:Int):Int{
    if(b==0)
        throw Exception("Không chia được cho 0")
    return a/b
}

fun main(args: Array<String>) {
    try {
        val res = Thuong2(10,2)
        println(res)
    }catch (e:Exception){
        println(e.message)
    }
    finally {
        println("Exit")
    }
    print("Đoạn code phía sau")
}
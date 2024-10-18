fun Thuong(a:Int, b:Int):Int{
    return a/b
}

fun main(args: Array<String>) {
    try {
        Thuong(5,0)
    }catch (e:Exception)
    {
        e.printStackTrace()
    }finally {
        println("Lỗi hay không lỗi vẫn thực hiện !")
    }
    print("Đoạn code phía sau")
}
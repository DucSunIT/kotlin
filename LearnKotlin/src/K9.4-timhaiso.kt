fun main(args: Array<String>) {
    print("Nhập tổng hai số = ")
    var tong: Float? = readln().toFloat()
    print("Nhập hiệu hai số = ")
    var hieu: Float? = readln().toFloat()
    if (tong != null && hieu != null) {
        val res1: Float = (tong + hieu) / 2
        val res2: Float = (tong - hieu) / 2
        println("Giá trị x cần tìm là: $res1")
        println("Giá trị y cần tìm là: $res2")
    }

}
fun main(args: Array<String>) {
//    print("Nhập tháng: ")
//    var month: Int? = readln()?.toInt()
//    if (month != null) {
//        when (month) {
//            1, 2, 3 -> print("Tháng $month thuộc quý 1")
//            4, 5, 6 -> print("Tháng $month thuộc quý 2")
//            7, 8, 9 -> print("Tháng $month thuộc quý 3")
//            10, 11, 12 -> print("Tháng $month thuộc quý 4")
//            else -> print("Invalid")
//        }
//    }

    // kiểm tra trong vùng dữ liệu
//    print("Nhập lương: ")
//    var salary: Int? = readln()?.toInt()
//    if (salary != null) {
//        when (salary) {
//            in 1..3 -> print("Nghèo kiếp xác")
//            in 4..7 -> print("Nghèo vừa vừa")
//            in 8..19 -> print("Thu nhập khá")
//            in 20..50 -> print("Thu nhập cao")
//            in 51..1000 -> print("Đại gia")
//            else -> print("Invalid!")
//        }
//    }

    // dùng when như một biểu thức trả về kết quả
//    print("Nhập a = ")
//    var a: Int? = readln()?.toInt()
//    if (a != null) {
//        val res = when (a) {
//            in 0..100 -> true
//            else -> false
//        }
//        print(res)
//    }

    // dùng when như một biểu thức if...else
    val a = 100
    when {
        a % 2 == 0 -> print("$a là số chẵn")
        a % 2 != 0 -> print("$a là số lẻ")
    }
}
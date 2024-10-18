fun main(args: Array<String>) {
    print("Nhập tháng: ")
    var month: Int? = readln()?.toInt()
    if (month != null) {
        when (month) {
            1, 2, 3 -> print("Tháng $month thuộc quý 1")
            4, 5, 6 -> print("Tháng $month thuộc quý 2")
            7, 8, 9 -> print("Tháng $month thuộc quý 3")
            10, 11, 12 -> print("Tháng $month thuộc quý 4")
            else -> print("Invalid!")
        }

    }
}
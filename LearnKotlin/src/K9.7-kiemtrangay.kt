fun main(args: Array<String>) {
    print("Nhập tháng: ")
    var month: Int? = readln()?.toInt()
    when (month) {
        1, 3, 5, 7, 8, 10, 12 -> println("Tháng $month có 31 ngày")
        4, 6, 9, 11 -> println("Tháng $month có 30 ngày")
        2 -> {
            print("Nhập năm: ")
            var year: Int? = readln()?.toInt()
            if (year != null) {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                    print("Tháng $month năm $year có 29 ngày")
                else print("Tháng $month năm $year có 28 ngày")
            }
        }

        else -> print("Invalid")
    }
}
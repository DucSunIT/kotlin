fun main(args: Array<String>) {
    print("Nhập năm: ")
    var year: Int? = readln()?.toInt()
    if (year != null) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            print("$year là năm nhuận")
        else print("$year không phải là năm nhuận")
    }

}
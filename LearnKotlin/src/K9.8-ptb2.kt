import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    print("Nhập hệ số a: ")
    var a: Double? = readln()?.toDouble()
    print("Nhập hệ số b: ")
    var b: Double? = readln()?.toDouble()
    print("Nhập hệ số c: ")
    var c: Double? = readln()?.toDouble()
    if (a != null && b != null && c != null) {
        if (a == 0.0) {
            if (b == 0.0) {
                print("Phương trình vô nghiệm")
            } else {
                print("Phương trình có nghiệm x = ${-b / c}")
            }
        } else {
            val delta = b.pow(2) - (4 * a * c)
            if (delta < 0.0) print("Phương trình vô nghiệm")
            else if (delta == 0.0) {
                val x = -b / (2 * a)
                print("Phương trình có nghiệm kép x1 = x2 = $x")
            } else {
                val x1 = (-b + sqrt(delta)) / (2 * a)
                val x2 = (-b - sqrt(delta)) / (2 * a)
                print("Phương trình có nghiệm kép x1 = $x1, x2 = $x2")
            }
        }

    }
}
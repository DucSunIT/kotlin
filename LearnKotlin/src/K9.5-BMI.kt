import kotlin.math.pow

fun main(args: Array<String>) {
    print("Nhập chiều cao (m): ")
    var tall: Float? = readln()?.toFloat()
    print("Nhập cân nặng: ")
    var weight: Float? = readln()?.toFloat()
    var BMI: Float? = 0f

    if (tall != null && weight != null) {
        BMI = weight / (tall.pow(2))
        println("BMI = $BMI")
        if (BMI < 15) print("Thân hình quá gầy")
        else if (BMI >= 15 && BMI < 16) print("Thân hình gầy")
        else if (BMI >= 16 && BMI < 18.5) print("Thân hình hơi gầy")
        else if (BMI >= 18.5 && BMI < 25) print("Thân hình bình thường")
        else if (BMI >= 25 && BMI < 30) print("Thân hình hơi béo")
        else if (BMI >= 30 && BMI < 35) print("Thân hình béo")
        else print("Thân hình quá béo")
    }
}
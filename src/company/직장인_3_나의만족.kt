
class 회사평가 {
    val m = mapOf<String, Int>(
            "일이좋다"   to 25,
            "자부심"     to 30,
            "높은연봉"   to 25,
            "유명회사"   to 20,
            "야근당연"   to -60)

    var 만족도 : Int = 0

    // infix는 확장함수나 멤버함수로 구현되어야 한다.
    infix fun 추가(s : String) : Int{
        this.만족도 += m[s]!!
        return this.만족도
    }
}

fun main(args: Array<String>) {
    // 삶은 이런 것!!
    var 내회사 = 회사평가()
    내회사 추가 "일이좋다"
    내회사 추가 "자부심"
    내회사 추가 "높은연봉"
    내회사 추가 "유명회사"
    내회사 추가 "야근당연"

    println(내회사.만족도)
}
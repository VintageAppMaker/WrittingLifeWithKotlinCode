package life

fun main(args: Array<String>) {

    // 심각하게 중요한 내용인데, 심각하게 무시하더라...
    val (아는것, 하는것) = listOf("경험에서 나와야 한다", "지금 이 순간에 하고있는 것")
    println("아는 것과 하는 것은 ${ if(아는것 == 하는것) "같다" else "다르다" }")

    // 경험상 3번에 1번은 안되더라..
    val 실패주기 = 3
    val (성공1, 성공2, 성공3 ) = (0..10).map { it }.filter { it % 실패주기 != 0 }
    println ("경험상 10 번중 $성공1 , $성공2 , $성공3 순서로 ..$실패주기 번 주기로 실패를 경험한다")

    // 아는 것이 없다면..? 할까?
    val 입코딩행위 = { 아는것 : String ->
        val 내가아는것 ="내가아는것만"
        listOf(아는것, 아는것==내가아는것)
    }
    val (내가아는것, 할수있남) = 입코딩행위("그건 모르는데?")
    println("내가아는것이 [${내가아는것}] 이면 할 수있는 지는 [${할수있남}] 이다.")
}


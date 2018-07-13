package life

fun main(args: Array<String>) {

    인생이라는레이블@
    run {
        println ("동료로 인정하는 상대의 능력치(20-100)")
        val 최소점수       = readLine()!!.toInt()
        val 동료들의능력   = listOf(80, 70, 50, 60, 75, 50, 20, 50, 50, 20, 50)
        val 라스트맨스탠딩 = 동료들의능력.filter { it > 최소점수 }

        return@run 라스트맨스탠딩

    }.also { if ( it.count() < 1) return }.let {
        남은동료 ->
        println ("$남은동료 가 동료임")
        println ("동료가 내게 도움을 줄 최대능력은")

        var 합계 = 0
        남은동료.map { 합계 = 합계 + it }.let { println(합계) }

        println ("동료를 포용한만큼 능력은 누적된다")

    }

}


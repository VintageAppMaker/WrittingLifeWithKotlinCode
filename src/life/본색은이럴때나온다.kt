package life

import java.util.*

fun main(args: Array<String>) {
    val 가치있는사람 = 5
    println ("가치있는 사람의 기준이 ${가치있는사람}라면..")
    (0..10).map { Random()
            .let  { it.nextInt(가치있는사람 * 2) }
            .also {
                if (it < 가치있는사람) {
                    println("${it}이면 ${가치있는사람 - it}만큼 본색이 들어난다")
                    return@map
                }
            }
            .let  { println("${it}이면 ${it - 가치있는사람}만큼 본색을 숨긴다") }}

    println ("사람의 본색은\n" +
            "자신이 무시하는 사람 앞에서\n" +
            "정확히 들어난다.")
}
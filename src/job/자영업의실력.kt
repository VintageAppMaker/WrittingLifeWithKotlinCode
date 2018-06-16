package job

import java.util.*

fun main(args: Array<String>) {
    var 총수익   = 0
    var 일했음   = 0
    val 영업기회 = 2

    // 1년 12달을 돌려보니
    (1.. 12).map{

        Random().apply{
            val 일을얻다 = nextInt(영업기회)
            if(일을얻다 > 0){
                Random().apply {
                    val 최소인건비 = 250
                    val 수익       = nextInt(400) + 최소인건비
                    총수익 = 총수익 + 수익
                    일했음 = 일했음 + 1
                    println ("${it}월 -> 수익은 ${수익}만원")
                }
            }
        }
    }

    println("총수익은 ${총수익} 만원, 일을 했던 달은 ${일했음}")
    println("자영업 개발자의 능력은 1. 영업 2. 계약 3. 수금")
    /*
    이렇게 돌려보니
        영업을 늘려야 하고 ,
        계약을 재대로 해야 하며,
        수금을 칼같이 해야하더라는..
        ㅜㅜ
    */
}
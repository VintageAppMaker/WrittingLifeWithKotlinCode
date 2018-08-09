package job

fun main(args: Array<String>) {

    val 알바        : (Double)->(Int )->(String)->String = ::노동의댓가
    val 평범한직장인: (Int)->(String)->String            = 노동의댓가(25000.0)
    val 개발자      : (Int)->(String)->String            = 노동의댓가(35000.23)
    val 고액연봉자  : (String)->String                   = 노동의댓가(45000.23)(8 * 5 * 5 )

    listOf<()->String>(
            {알바(7800.0)(8 * 5 * 4)("알바")},
            {평범한직장인(8 * 5 * 4)("일반인")},
            {개발자(8 * 5 * 4)("개발자")},
            {고액연봉자("나님만이 세상을 구한다")},
            {"퇴직자의 희망사항:" + 노동의댓가(30000.0)(8 * 5 * 4)("뭐라고 불리던")}
    ).map{ it().let{ 결과 -> println ( 결과 )} }

}

// currying의 그나마 존재이유
// seed값을 지정한 계산함수 생성하기
fun 노동의댓가(시간당금액 : Double) :
        (Int) ->(String) -> String
        = fun (시간 : Int)
        = fun ( 직업 : String ) : String {
            return if( 시간 >  8 * 5 * 4)
                "[${직업}]님은 돈이 문제가 아님. 인생이 손해임. 약값이 더 들어감"
            else
                "[${직업}]입니다. ${시간당금액 * 시간}만큼 받습니다. "
        }

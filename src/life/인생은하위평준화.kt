package life

// Kotlin에서 DSL을 이용하기 위한
fun main(args: Array<String>) {

    // 복잡한 구조로
    // Data class에 여러개의 값을 대입할 경우.
    // DSL이 편리할 수도 있다.
    val 우리회사인재상 = 지원자정보 {
        이름 = "한국인은 다됨"
        경력 {
            직책 = "임원제외한 무관"
            연차 = 10
            경험프로젝트 = 10
        }
    }

    val 김부장 = 지원자정보 {
        이름 = "김모씨"
        경력 {
            직책 = "부장"
            연차 = 15
            경험프로젝트 = 70
        }
    }

    val 박이사 = 지원자정보 {
        이름 = "박모씨"
        경력 {
            직책 = "이사"
            연차 = 20
            경험프로젝트 = 80
        }
    }

    println ( 우리회사인재상 지원적합 김부장 )
    println ( 우리회사인재상 지원적합 박이사 )
    println ("${김부장} : \"${박이사}  ")

}

// DSL을 구현하기 위한 확장함수들
// {}안으로 들어갈때마다
// 확장함수를 모두 만들어주어야 한다.
fun 지원자정보(block: Player.() -> Unit): Player = Player().apply(block)
fun Player.경력(block : Status.()-> Unit){
    경력 = Status().apply(block)
}

infix fun Player?.지원적합(p : Player? ) : Boolean {
    if ( p!!.경력!!.연차!! > 15)          return false
    if ( p!!.경력!!.경험프로젝트!! < 10 ) return false
    return false
}

// data class
data class Player(var 이름: String? = null,
                  var 경력: Status? = null)
data class Status(var 직책: String? = null,
                  var 연차: Int?    = null,
                  var 경험프로젝트 : Int? = 5
                  )
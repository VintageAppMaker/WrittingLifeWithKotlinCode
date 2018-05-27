package job

fun main(args: Array<String>) {

    var 일하는사람 : 개발자?  = null
    fun 개발자?.프로젝트진행(요구 : String){
        this!!.요구분석("쇼핑몰앱")
        this!!.개발하기()
        this!!.결과물만들기()
    }

    일하는사람 = 일을아는개발자
    일하는사람.프로젝트진행("쇼핑몰")

    일하는사람 = 일을모르는개발자
    일하는사람.프로젝트진행("쇼핑몰")

}

interface 개발자{
    fun 요구분석(s : String)
    fun 개발하기()
    fun 결과물만들기()
}

val 일을아는개발자 = object : 개발자 {
    var 요구분석 : String? =null
    fun p(s : String) = println ("${this.javaClass.name}: ${s}")
    override fun 요구분석(s: String) {
        요구분석 = s
        p("고객의 요구는 [${요구분석}] 이지만, OOO가 먼저 근본적으로 구현되어야 한다.")
    }

    override fun 개발하기() {
        p("협업을 생각하며 일정을 관리하고 기능을 채크한다")
    }

    override fun 결과물만들기(){
        p("결과물에 책임지는 자세. 노력보다는 결과를 중시")
    }
}

val 일을모르는개발자 = object : 개발자 {
    var 내가할일만 : String? = null
    fun p(s : String) = println ("${this.javaClass.name}: ${s}")
    override fun 요구분석(s: String) {
        내가할일만 = if(s.length < 5) "시키는대로만 하겠다" else "그 일은 내가관여할 바가 아니다"
        p("내가할일은 [${내가할일만}]이다")
    }

    override fun 개발하기() {
        p("내 할일만 잘하면 된다. 진행상황은 모른다.")
    }

    override fun 결과물만들기() {
        p("결과물에 무책임한 자세. 시킨 일을 했는가에만 관심있다.")
    }

}


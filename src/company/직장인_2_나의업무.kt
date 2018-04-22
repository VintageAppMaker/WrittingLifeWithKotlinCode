fun 나의업무인가(업무요청 : String) : Boolean {
    val 나의업무 = arrayListOf<String>("개발", "기술검토", "솔루션설계")
    if( 업무요청 in 나의업무 ){
        return true
    }
    return false
}

fun main(args: Array<String>) {
    나의업무인가("기획회의").let{
        답변 -> println ("기획회의는 ${답변}")
    }

    나의업무인가("기술지원(응대)").let{
        답변 -> println ("기술지원(응대) ${답변}")
    }

    나의업무인가("제품 시장성").let{
        답변 -> println ("제품 시장성 ${답변}")
    }
}

fun 업무스타일() : (String) -> Unit {
    var 연차: Int = 0;

    // 견고함
    class 전문가coding{
        fun 메시지출력(s : String?){
            println ("전문가모드:"+ s)
        }
    }
    // 단순하지만 복잡한...
    fun 나만의철학coding(s : String?){
        val 메모리에러 : String = "메모리에러입니다"
        val 최대크기   : Int    = 17
        if( s == null ) return
        var f : (String) -> Unit = Exit@{
            입력값 -> if(입력값.length > 최대크기 ){
                println (메모리에러)
                return@Exit
            }
            println ("철학자모드:$s")
        }

        f(s)
    }
    // closure..
    return fun (s : String) : Unit{

        when(연차){
            in ( 0 .. 2 ) -> println (s)                    // 스타일 없음
            in ( 3 .. 7)  -> {전문가coding().메시지출력(s)} // 전문가 스타일
            in ( 8 .. 21) -> {나만의철학coding(s)}          // ????
        }

        연차++

        return;
    };
}

fun main(args: Array<String>) {
    val 업무진행 = 업무스타일()
    // 21년이 지나감에 따라 업무스타일이...
    for ( i in ( 0.. 21) )
        업무진행("${i}년차: Hello World ")
}


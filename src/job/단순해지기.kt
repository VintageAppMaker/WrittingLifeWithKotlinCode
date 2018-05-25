package job

fun main(args: Array<String>) {
    "처음에는".쉽게한다("무엇이던")
    "조금지나".따라한다("규격화")
    "경력되니".엄격해진다("구조와 습관")
    "경험늘어".나만의철학(
            { if (it.length < 1) return@나만의철학; println("경험늘어 ${it}으로 개발한다") },
            "나만의 구조와 습관")

    "최고조는".트랜드와경쟁{
        val 내가원하는트랜드 = listOf(1, 2, 3, 4, 5)
        ( 0 .. 10 ).filter { it in 내가원하는트랜드 }
                .reduce{i, i2 -> println("트랜드는 ${i}, 내 능력은 ${i + i2}"); i + i2  }
                .let{ println ("최종능력: $it 으로 노력하지만..") }
    }

    "결국에는".쉽게한다("대부분을")

    println("화장은 하는 것보다 지우는 것이 중요하다")
    println("코딩도 쉽게 버리고 고칠 수 있는 구조가 중요하다")
}

fun String.쉽게한다(s : String )   = println ( this + " " + s + " 쉽게한다")
fun String.따라한다(s : String )   = println ( "$this ${s}를 따라한다")
fun String.엄격해진다(s : String ) = println ( "$this ${ if(s != null) s else "null"}에 엄격해진다")

fun String.나만의철학(f : (String) -> Unit, s : String ) = f(s)
fun String.트랜드와경쟁(f : () -> Unit) = f()

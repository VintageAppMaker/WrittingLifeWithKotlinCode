package job

fun main(args: Array<String>) {
    val 만점 = 10
    val 나만의회사를_찾아서 = {
        횟수 : Int, 장점 : Int  ->
        print ("이직-" + 횟수.toString() +"] ")
        print ("이직선택이유: " + 장점.toString() +"개 / ")
        println ("이직회사불만: " + "${만점 - 장점}개 ")
        만점 - 장점
    }

    var 내가원하는장점 = 4
    (0..9).map{
        내가원하는장점 = 나만의회사를_찾아서(it, 내가원하는장점)

    }.let{
        println("결국 창업을 하지만, " +
                "회사생활을 더 그리워한다는.. " +
                "결국 뭘하던 비슷함. " +
                "회사가치보다 내 삶의 가치가 중요함" )
    }

}



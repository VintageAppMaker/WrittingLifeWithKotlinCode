package life

fun main(args: Array<String>) {
    겸손해져라()
    재대로공부해라()
    남의시선을신경써라()
}

fun 겸손해져라() {
    val 할말 = listOf<String>(
            "경험은 경험일 뿐", "논리는 논리일 뿐",
            "시간과 장소가 다르면 언제나 신입일 뿐")

    println ("[겸손해져라]")
    할말.mapIndexed{ n, s ->  "$n : $s" }
            .map { println ("$it")}
            .let { println ("입니다. 그러니 아는 척하지 마세요!")}
            .let { println("-----------") }
}

fun 재대로공부해라() {
    val 할말 = listOf<String>(
            "원하는 나와 현실의 나를 구분", "기본에 충실해라",
            "트랜드와 현업현실은 다른것")

    println ("[재대로공부해라]")
    할말.forEachIndexed { index, s -> println ("$index : $s") }
            .let{ println ("입니다. 기본에 충실하세요") }
            .let { println("-----------") }

}

fun 남의시선을신경써라() {
    println ("[남의시선을신경써라]")
    val s = "1. 남이보는 내가 더 정확할 때가 많다"
            .let{ "$it 2. 불편하면 고쳐라\n"}
            .let{ "$it 3. 한만큼 돌아온다\n" }
    println (s)
}


fun main(args: Array<String>) {
    자영업개발자로_생존법()
    내자신을_브랜딩하는법()
    그냥해보자()
}

infix fun String?.HowTo(pFunc : (s : String ) -> Unit){
    pFunc(this!!)
}

fun String?.p(){
    println(this!!)
}

fun 자영업개발자로_생존법() {
    "1.주제파악" HowTo{ "$it : 해라".p() }
    "2.인맥확보" HowTo{ "$it : 해라".p() }
    "3.개발할것" HowTo{
        ("$it : #OO알못시장이 생존법이다"
         + "\n-경쟁력(?)\n-내가아는것(X)\n-내가할것(O)").p()
    }
    "4.금전관리" HowTo{ "$it : 상식을 버려라".p() }
    "5.위기대처" HowTo{ "$it : 본능과 만나는 시간".p() }
    "6.멘탈케어" HowTo{ "$it : 종교와 철학".p() }
}

fun 내자신을_브랜딩하는법() {
    "7.One Man Compay와 프리랜서 차이"    HowTo{"$it : 상식을 버려라".p() }
    "8.움직이는 사무실-모바일오피스 구축" HowTo{"$it : 내가있는 곳이 사무실".p()}
    "9.기획과 개발은 빠르고 유연하게"     HowTo{"$it : 핸드폰이 피씨임.".p()}
    "10.자체브랜드 만들기"                HowTo{"$it : Android 만세!".p()}
    "11.개발자만의 SEO"                   HowTo{"$it : App이 SEO 끝판왕!".p()}
    "12.업무와팀빌딩"                     HowTo{"$it : 나님의 인성을 디버깅하는 시간!".p()}
}

fun 그냥해보자() {
    "13.마켓앱분석"           HowTo{"$it : 마켓은 팬덤이다!".p()}
    "14.AppBook소스 활용하기" HowTo{"$it : 있는 것 대충사용하기".p()}
}


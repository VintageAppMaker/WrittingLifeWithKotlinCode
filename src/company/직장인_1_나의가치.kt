var 나의가치 :String = "기술지향적 개발자"
    get (){
        return field
    }
    set(value) {
        field = "니가 뭐라해도! 난 순수한 개발자다"
    }

fun main(args: Array<String>) {
    // 남이 말하는 나의 가치
    나의가치 = "까칠하다. 괴랄하다. 그래도 뭔가 만들긴하더라"

    // 내가 말하는 나의 가치
    println (나의가치)
}
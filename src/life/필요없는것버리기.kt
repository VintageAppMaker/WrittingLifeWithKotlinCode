package life

fun main(args: Array<String>) {

    println ("천재가배운다------------")
    val 천재가배운다 = 암기광()
    println ( "알고있다:  " + 천재가배운다("가나다라마바사") )
    println ( "알고있다:  " + 천재가배운다( 100 *30 /2 ) )
    println ( "알고있다:  " + 천재가배운다({ v : Int -> v * 10}) )
    println ( "알고있다:  " + 천재가배운다(listOf("A", 3, 6.0f)) )

    println ("나는배운다------------")
    val 나는배운다 = 최소화()
    println ( "할수있다:  " + 나는배운다("가나다라마바사") )
    println ( "할수있다:  " + 나는배운다( 100 *30 /2 ) )
    println ( "할수있다:  " + 나는배운다({ v : Int -> v * 10}) )
    println ( "할수있다:  " + 나는배운다(listOf("A", 3, 6.0f)) )
}

fun 암기광(  ) : (Any) -> String {
    var 나의지식 = mutableListOf<Any>()
    fun 알필요있나( v : Any) : Boolean = true

    return fun ( v : Any ) : String {
        if(알필요있나(v)) 나의지식.add(v)
        return 나의지식.toString()
    }
}

fun 최소화(  ) : (Any) -> String {
    var 나의지식 = mutableListOf<Any>()
    fun 알필요있나( v : Any) : Boolean = if( v is String ) true else false

    return fun ( v : Any ) : String {
        if(알필요있나(v)) 나의지식.add(v)
        return 나의지식.toString()
    }
}

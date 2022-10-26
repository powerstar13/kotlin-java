package exception

enum class CountryCodeKotlin {
    kr, jp, us, `do`; // 코틀린에서도 do가 예약어읻지만 벡틱 문자를 사용하면 문제를 해결할 수 있다.
}

fun main() {

    val javaKeyword = JavaKeyword()
    javaKeyword.`in` // 예약어인 경우 벡틱(`)을 사용하면 된다.
    javaKeyword.`is`
}
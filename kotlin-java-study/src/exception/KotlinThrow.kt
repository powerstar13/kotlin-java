package exception

import java.io.IOException

class KotlinThrow {

    @Throws(IOException::class) // java에서 체크드 익셉션에 대해 예외처리를 전파하고 싶은 경우 throws를 붙이는 것처럼 코틀린에서도 @Throws 애노테이션을 통해 예외처리를 전파하여 사용하는 쪽에서 try-catch를 사용하게 할 수 있다.
    fun throwIOException() {
        throw IOException("체크드 익셉션인 IOException 발생")
    }
}

fun main() {

    val javaThrow = JavaThrow()
    javaThrow.throwIOException() // 코틀린에서는 체크드 익셉션에 대해 예외처리(try-catch)를 강제하지 않는다.

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()
}
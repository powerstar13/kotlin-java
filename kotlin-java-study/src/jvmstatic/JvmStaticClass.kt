package jvmstatic

class JvmStaticClass {

    companion object {

        @JvmStatic
        fun hello() = "hello!"
    }
}

object HiObject {

    @JvmStatic
    fun hi() = "hi!"
}

fun main() {

    val hello = JvmStaticClass.hello()

    val hi = HiObject.hi()
}
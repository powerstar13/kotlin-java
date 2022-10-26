package gettersetter

import java.time.LocalDate

class Student {

    @JvmField
    var name: String? = null

    var birthDate: LocalDate? = null

    val age: Int = 10

    var grade: String? = null
        private set // 내부에서만 사용할 수 있도록하고 외부에선 setter를 사용 못하도록 막는다.

    fun changeGrade(grade: String) {
        this.grade = grade
    }
}
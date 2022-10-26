package study.kotlinjava.kotlinjavaspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.Transactional
import javax.persistence.*

@SpringBootApplication
//open class KotlinJavaSpringApplication // allopen 플러그인을 통해 open을 수시로 붙여야 하는 문제를 해결할 수 있다.
class KotlinJavaSpringApplication

fun main(args: Array<String>) {
    runApplication<KotlinJavaSpringApplication>(*args)
}

@Transactional
class transactionService

@Entity
@Table
class Person(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,

    @Column
    var name: String,

    @Column
    var age: Int,
)
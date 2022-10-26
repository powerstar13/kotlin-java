fun main() {

    val hero = Hero()

//    hero.name = "아이언맨"
//    println(hero.name)

    hero.address = "스타크타워"
    println(hero.address)

    // 자바 클래스를 코틀린 클래스로 마이그레이션 후 사용하는 것을 제일 추천
    val heroKt = HeroKt(name = "아이언맨", age = 50, address = "스타크타워")
    println(heroKt)
}
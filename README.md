# 자바 프로젝트에 코틀린 도입해보기

## 게터, 세터 호출하기

1. 자바에서 코틀린 프로퍼티를 호출할 때 게터, 세터를 사용한다.
2. val로 선언한 프로퍼티는 불변이기 때문에 게터만 존재한다.
3. 세터를 private 가시성으로 변경하면 var로 선언해도 세터를 없앨 수 있다.
4. `private set`으로 세터를 제거하면 내부에서만 변경하거나 외부 접근 함수를 별도로 만들어야 한다.
5. `@JvmField` 사용해서 코틀린 프로퍼티 접근
    1. 코틀린의 프로퍼티는 자바로 변환 시 필드는 private이고 게터, 세터를 통해서만 접근이 가능하다.
6. 코틀린에서 자바의 게터, 세터를 호출할 땐 기존 자바 스타일과 동일하게 쓸 수 있다.
    1. 코틀린 스타일대로 프로퍼티를 직접 사용할 수 있다. (추천)

## 코틀린의 예외처리와 자바 예약어 접근 방법

1. 자바에선 `체크드 익셉션`을 다룰 때 try-catch나 throws가 필수다.
2. 코틀린에는 `체크드 익셉션`이 존재하지 않음
   1. 그러므로 코틀린에서 IOException을 발생시키는 함수를 자바에서 사용해도 예외 처리가 강제되지 않는다.
   2. 자바 개발자는 이런코드에 대해 습관적으로 try-catch문으로 감싸곤한다.
      1. 그러나 예상과는 다르게 컴파일 에러가 발생한다.
      2. 자바를 생각해보면 `throws IOException`를 사용해서 발생 가능 예외에 대해 사용하는 측에 전달할 수 있다.
      3. 코틀린도 이와 마찬가지로 자바와의 상호 운용을 위한 `@Throws`를 제공한다.
         1. 자바 컴파일러가 체크드 익셉션을 인지해 컴파일 에러가 발생하지 않는다.
3. 자바와 상호운용하는 경우, 특정 변수명이 자바에선 문제가 없으나 코틀린에선 예약어인 경우가 있다.
   1. 예를 들어 관례적으로 많이 사용하는 `in`, `is`가 그렇다.
   2. 코틀린에서 바로 사용하면 컴파일 에러가 발생한다.
      1. 벡틱(```)문자를 사용해 해결할 수 있다.
         1. 이런기능은 별 필요 없어 보이지만 경우에 따라선 비즈니스와도 연결될 수 있다.
            1. 예를 들어 글로벌 서비스를 제공하는 회사에서 도미니카 공화국을 지원하기 위해 국가코드로 `do`를 사용하는데 do는 do-while문 예약어이다.
            2. 자바로는 처리가 어렵지만 코틀린은 예약어 이스케이프가 가능하기 때문에 도미니카 공화국도 서비스 제공가능

## @JvmStatic을 이용해 정직 함수 호출하기

1. 동반 객체와 object 키워드로 정의된 싱글톤 객체에서 정의된 함수를 코틀린에서 사용하면 자바의 static 메서드와 유사하게 사용할 수 있다.
2. `@JvmStatic`을 사용하면 자바의 static 메서드처럼 사용할 수 있다.
3. `const` 키워드를 사용한 상수는 자바의 static 프로퍼티처럼 직접 사용이 가능하다.
4. 상수가 아닌 경우에도 자바의 static 프로퍼티와 같이 사용하려면 `@JvmField`를 사용한다.

## 자바에서 확장함수 호출하기

1. 자바에서 사용할 땐 `파일명(클래스명).메서드명` 형태로 사용해야 한다.
2. 코틀린 확장함수가 변환된 static 메서드의 첫 번째 인자로 확장 대상 수신자 객체를 넘겨줘야하는 것을 알 수 있다.
3. 코틀린에선 마치 기존의 String 클래스에 존재하는 인스턴스 함수인 것처럼 사용하지만 자바에선 static 메서드로 호출해야 한다.


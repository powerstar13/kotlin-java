package gettersetter;

import java.time.LocalDate;

public class JavaGetterSetterExample {
    
    public static void main(String[] args) {
    
        Student student = new Student();
        student.name = "스티브로저스"; // @JvmField 애노테이션을 사용하면 코틀린처럼 프로퍼티에 직접 접근할 수 있다.
        student.setBirthDate(LocalDate.of(1918, 7, 4));
    
        System.out.println(student.name);
        System.out.println(student.getBirthDate());
    
//        student.setAge(10); // val로 선언된 코틀린 프로퍼티는 setter를 사용할 수 없다.
        System.out.println(student.getAge());
        
//        student.setGrade(""); // private set 처리된 프로퍼티는 setter를 외부에서 사용할 수 없다.
        student.changeGrade("A");
        System.out.println(student.getGrade());
    }
}

package entensions;

public class ExtensionExample {
    
    public static void main(String[] args) {
        
        // 코틀린에서 처럼 확장함수를 바로 사용할 수 없다.
//        "ABCD".first();
//        "ABCD".addFirst('Z');
        
        // 자바에서는 static 메서드에 접근하여 첫 번째 인자에 수신자 객체를 전달하여 사용한다.
        char first = MyExtensionsKt.first("ABCD");
        System.out.println(first);
        
        String addFirst = MyExtensionsKt.addFirst("ABCD", 'Z');
        System.out.println(addFirst);
    }
}

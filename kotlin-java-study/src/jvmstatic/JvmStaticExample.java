package jvmstatic;

public class JvmStaticExample {
    
    public static void main(String[] args) {
    
//        String hello = HelloClass.Companion.hello();
//        String hi = HiObject.INSTANCE.hi();
        
        String hello = JvmStaticClass.hello(); // @JvmStatic 애노테이션을 통해 정적 메서드에 바로 접근할 수 있다.
        String hi = HiObject.hi();
    }
}

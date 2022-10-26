package jvmstatic;

public class JvmFieldExample {
    
    public static void main(String[] args) {
    
//        int id = JvmFieldClass.Companion.getId();
//        String name = JvmFieldObject.INSTANCE.getName();
        
        int id = JvmFieldClass.id; // @JvmField 애노테이션을 통해 상수가 아닌 프로퍼티에도 직접 접근이 가능하다.
        String name = JvmFieldObject.name;
    
        int code = JvmFieldClass.CODE;
        String familyName = JvmFieldObject.FAMILY_NAME;
    }
}

package exception;

import java.io.InputStream;

public class JavaKeyword {
    
    private InputStream in;
    
    private Boolean is;
    
    public InputStream getIn() {
        return in;
    }
    
    public void setIn(InputStream in) {
        this.in = in;
    }
    
    public Boolean getIs() {
        return is;
    }
    
    public void setIs(Boolean is) {
        this.is = is;
    }
}

enum CountryCodeJava {
    kr, jp, us; // 자바에서는 do가 에약어이기 때문에 처리하기 어렵다.
}
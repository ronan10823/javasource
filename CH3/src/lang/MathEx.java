package lang;

import static java.lang.Math.*;

public class MathEx {
    public static void main(String[] args) {
        // Math.random(); // random은 static 메소드임을 알 수 있다. 
        double val = 90.7557;
        // System.out.println("반올림 " + Math.round(val));
        // System.out.println("올림 " + Math.ceil(val));
        // System.out.println("버림 " + Math.floor(val));
        // System.out.println("PI " + Math.PI);

        System.out.println("반올림 " + round(val));
        System.out.println("올림 " + ceil(val));
        System.out.println("버림 " + floor(val));
        System.out.println("0<=x<1 " + random());
        System.out.println("PI " + PI);
    }
}

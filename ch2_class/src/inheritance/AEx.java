package inheritance;

public class AEx {
    public static void main(String[] args) {
        A obj = new A();
        // B b = new B();
        // obj.methodA(b);
        obj.methodA(new B());
    }
}

package inheritance;

public class A {
    public void methodA(I i){ // 중간에 interface가 있기에, B b에서 I i로 변경
        i.methodB();
        // 1. 매개변수를 받는 방법, B b
        // 1-2. 직접 사용 b.method();

    }

    
}

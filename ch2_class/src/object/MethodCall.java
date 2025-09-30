package object;

public class MethodCall {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;

    // 내부에서 내부의 것을 호출할때는 이름만 써도 호출된다. 
    static void staticMethod1() {
        MethodCall obj = new MethodCall();
        System.out.println(obj.iv);
        // iv는 인스턴스가 생성되지 않았기 때문에 실행이 안된다.
        System.out.println(cv);
    }
    void instanceMethod1() {
        //static 변수 호출 가능한가?
        System.out.println(cv);
        //인스턴스 변수 호출 가능한가?
        System.out.println(iv);
        // cv는 이미 올라와서 사용 가능한 것이다.
        // 메서드와 iv가 올라가는 순서가 동일하기 때문에 사용이 가능하다고 표시되는 것이다.
    }
    static void staticMethod2() {
        //클래스 메소드 호출
        staticMethod1();
        //인스턴스 메소드 호출
        MethodCall obj = new MethodCall();
        obj.instanceMethod1();
    }


    void instanceMethod2() {
        // 클래스 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출
        instanceMethod1();
    }
    // 외부와 내부 모두 동일하게 적용된다. 
}

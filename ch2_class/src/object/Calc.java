package object;

public class Calc {
    // 속성은 없음, 메소드만
    // avg : x, y 값을 이용해 평균
    // x + y / 2 

    int plus(int x, int y) {
        return x + y;
    }

    double avg(int x,  int y) {
        // plus(x, y) 
        // plus 호출, plus는 int로 return, 호출이 필요함
        int result = plus(x, y);
        return result / 2;
        // 한 메소드에서 다른 메소드를 호출할 수 있다. 
    }

    void execute() {
        double result = avg(15, 8);
        println("실행결과 : " + result);
    }
    // 내부 호출 연습

    void println(String message) {
        System.out.println(message);
    }

}

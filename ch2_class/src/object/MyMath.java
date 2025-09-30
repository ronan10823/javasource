package object;

public class MyMath {
    long add(long a, long b){
        return a + b;
    }
    long add(long a, long b, int c){
        return a + b + c;
    }

    int add(int a, int b){
        return a + b;
    }
    long subtract(long a, long b){
        return a - b;
    }
    long multiply(long a, long b){
        return a * b;
    }
    double divide(double a, double b){
        return a / b;
    }
    // Duplicate method add(long, long) in type MyMath
    // 생성자는 여러 개 생성할 수 있지만, 괄호 안을 다르게 가야 한다.
    // 멤버 변수 x, 메소드만 o
}

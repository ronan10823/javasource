package operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        // 비교 연산자 : >, >=, <, <=, ==, !=
        // == : 같다, != : 같지 않다.
        // 결과값은 true(참), false(거짓)로 나온다. (boolean)

        int a = 10;
        float f = 10.0f;
        // 연산 수행 전 피연산자의 타입을 맞춘 후 비교
        System.out.println(a == f); // true
        System.out.println(a != f); // false
        System.out.printf("'A' == 65 = %b\n", 'A' == 65); // true
        // true나 false를 출력하는 변수는 %b이다. 
        // 'A'라는 char은 아스키 코드로 65이며, 65는 int형이기에 비교 연산 시, char이 int로 자동 형 변환이 일어난다.
    }
}

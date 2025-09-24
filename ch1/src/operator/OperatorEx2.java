package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        // 이항 연산자 : + - * / %

        int a = 10, b = 4;
        System.out.printf("%d + %d = %d\n", a, b, a + b); // 10+4=14
        System.out.printf("%d - %d = %d\n", a, b, a - b); // 10-4=6
        System.out.printf("%d * %d = %d\n", a, b, a * b); // 10*4=40
        System.out.printf("%d / %d = %d\n", a, b, a / b); // 10/4=2.5지만, %d 즉 int로 출력하기 때문에 2로 출력
        System.out.printf("%d %% %d = %d\n", a, b, a % b); // 나머지 연산자, 10/4=2 나머지 2
        // System.out.printf("%d % %d = %d\n", a, b, a % b); // 앞에서 %d,%c 등으로 포맷을 지정했기에 %를 작성해도 나누기로 인식하지 못한다. 만약 %를 사용하고 싶다면, %%로 작성해야 한다.
        System.out.printf("%d / %f = %f\n", a, (float)b, a / (float)b); // 10/4.000000=2.500000
        // 10/4=2.5, float로 바꿔서 출력, float로 나누고 float로 출력되는 값을 보고 싶어했기에 마지막 값도 float로 변환
        // 중요한 건, printf의 마지막 항에서 a/float(b)로 바꿔줘야 한다는 것

        // 서로 다른 타입을 연산할 경우, 연산은 큰 타입을 따라간다.
        // int/int => int 
        // int/float => flaot (아까 %d로 했었을 때에도 나왔는데, 그건 뭐였을까? > 실질적으로 계산이 되는 변수에 int가 들어갔기에 결과값도 int로 나온다. )
        // int/double => double (int를 double로 나누면 double 결과값이 출력된다는 의미.)

        char c1 = 'a', c2 = c1, c3 = ' ';
        //c3 = c1 + 1; // Error: Type mismatch: cannot convert from int to char
        // 왼쪽은 char, 오른쪽은 int라고 에러 메시지로 확인할 수 있다.
        // 1이라는 숫자는 기본 타입이 int로 인식된다.
        // char + int를 하면, int가 char보다 더 크기 때문에, int로 결과값이 나온다. 
        // char + int => int
        c3 = (char)(c1 + 1);
        int i = c1 + 1; // byte, short, char -> int로 자동 형 변환이 일어난다.
        // 만일 결과를 만들고 싶다면, (char)(c1 + 1)로 강제 형 변환을 해주거나,
        // int i = c1 + 1;로 int형 변수에 담아주면 된다.
        c2++;   // 'a' + 1
        System.out.println("i = " + i); // 98, i의 경우, 위에서 int로 받았기 때문에 정수 형태인 98로 출력, a는 97이기에 1이 증가한 98이 출력됨
        System.out.println("c2 = " + c2); // b, c2의 경우, 23 line에서 char로 정의했기에 char 형태인 b로 출력
        System.out.println("c3 = " + c3); // b, c3의 경우, 28 line에서 (char)로 강제로 형을 변환했기 때문에, char 형태인 b로 출력


        for (char j = 'a'; j <= 'z'; j++) {
            System.out.print(j + " ");
        }
    }
}

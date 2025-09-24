package operator;

public class OperatorEx5 {
    public static void main(String[] args) {
        // 삼항연산자 
        // 피연산자 3개, (조건식) ? 식1/참일때 : 식2/거짓일때
        // 반드시 조건식의 결과가 참/거짓(boolean)이어야 한다.
        // a > 10 ? "크다" : "작다"

        int x = 10, y = -5, z = 0;

        int data1 = x >= 0 ? x : -x; 
        int data2 = y >= 0 ? y : -y;
        int data3 = z >= 0 ? z : -z; 
        // x 아니면 -x는 숫자가 될 것이므로, 정수인 int형 변수에 담아준다.

        char sign1, sign2, sign3;
        sign1 = x > 0 ? '+' : ( x == 0 ? ' ' : '-');
        sign2 = y > 0 ? '+' : ( y == 0 ? ' ' : '-');
        sign3 = z > 0 ? '+' : ( z == 0 ? ' ' : '-');
        // x, y, z가 0보다 크면 앞에 +, 0이면 공백, 0보다 작으면 - 출력


        // 내가 결과값에 x = +10으로 나오게 하고 싶다면, 
        // +, -라는 부호는 문자 하나이기에 char형 변수인 %c로, 그 다음에 나올 숫자는 정수이기에 int형 변수인 %d로 포맷을 지정해준다.
        // 그리고, sign1, data1을 각각 %c, %d에 맞게 넣어준다.
        System.out.printf("x = %c%d\n", sign1, data1);
        System.out.printf("y = %c%d\n", sign2, data2);
        System.out.printf("z = %c%d\n", sign3, data3);

    }
}

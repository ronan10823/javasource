package operator;

public class OperatorEx4 {
    public static void main(String[] args) {
        // 논리 연산자 : &&(AND), ||(OR), !(NOT)
        // 피연산자로 boolean(true, false)만 허용
        // && : 그리고, || : 또는, ! : 아니다(부정)

        int x = 15;
        System.out.println(x > 10 && x < 20);
        // x는 10보다 크고, 20보다 작다. (AND)

        int i = 6;
        System.out.println(i % 2 == 0 || i % 3 == 0);
        // i는 2의 배수 또는 3의 배수이다. (OR)
        
        System.out.println((i % 2 == 0 || i % 3 == 0 ) && i % 6 !=0);
        // i는 2의 배수 또는 3의 배수지만, 6의 배수는 아니다. (OR, NOT)
        // i % 2 == 0 || i % 3 == 0 && i % 6 !=0
        // 이렇게 될 경우, &&가 ||보다 우선순위가 높기에, i는 2의 배수이거나, (3의 배수이면서, 6의 배수가 아니다.)로 해석된다.
        // 따라서, 괄호를 사용하여 우선순위를 명확히 해주는 것이 좋다.

        char ch = 'A';
        System.out.println( (ch >= 'a' && ch <= 'z') || 'A' <= ch && ch <= 'Z' );
        // 'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z' //소문자에 대한 조건식 
        // 문자 ch는 대문자 또는 소문자이다.

        // 조건식 = 변수로 담고 싶다면, 변수의 타입은 불리안으로 바꿔야 한다. 
        boolean result = (ch >= 'a' && ch <= 'z') || 'A' <= ch && ch <= 'Z'; 

        System.out.println(!result); // false
        // result가 true이기에, !result는 false가 된다. 
        // !true => flase / !false => true

    }
}

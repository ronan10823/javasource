package basic;

public class Variable4 {
    public static void main(String[] args) {
        // 논리형 : 참, 거짓
        boolean flag = true;
        System.out.println(flag ? "참" : "거짓");
        // flag(조건)이 true면 무조건 앞의 구문이 출력, false면 뒤의 구문 출력
        // 문자형
        char ch = 'a', ch2='가';
        // char ch3 = 'ab';
        // Error : Invalid character constantJava(1610612989), 홑따옴표 사이에는 무조건 하나의 문자만 입력
        // Java는 문자와 문자열을 구분, 문자(char): 홑따옴표 '', 문자열: 쌍따옴표 ""
        // String ch2 = "a";
        // 쌍따옴표 쓰는 순간 무조건 문자열, 문자열은 Java에서 String으로 표현
        // 일반적으로 string을 사용하긴 한다.
        System.out.println("ch = "+ch+", ch2 = "+ch2);
        System.out.printf("ch = %c, ch2 = %c\n", ch, ch2);
        System.out.printf("ch = %10c, ch2 = %5c\n", ch, ch2);
        System.out.println("ch = "+(ch + 1)); // 98, 
        System.out.println("ch2 = "+(ch2 + 1)); // 44033
        System.out.printf("ch2 = %c\n", (ch2 + 1)); // 각 %c=문자
        System.out.printf("ch2 = %d\n", (ch2 + 1)); // 44033 %d=숫자
        // 44033이 각이라는 문자에 할당된 문자
    }
}

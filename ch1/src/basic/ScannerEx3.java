package basic;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        // 키보드에서 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력 : ");
        int num1  = sc.nextInt(); // 35 엔터 = 내부적으로 사용되는 버퍼(클립보드 유사)에 저장됨, int는 35만 저장하고 엔터는 남는다.
        System.out.print("연산자 입력 : "); // + - * /, 이러한 사칙연산 관련 기호들은 문자(String)로 받는다.
        String op = sc.nextLine(); // Line, 엔터를 하나의 글자로 받아들이기 때문에 문제 발생
        System.out.print("두 번째 숫자 입력 : ");
        int num2 = sc.nextInt();

        System.out.println(op);
        System.out.println(num1 + num2);
        sc.close();
    }
}

// 동일한 클래스 아래 동일한 이름의 파일이 존재할 수 없다.
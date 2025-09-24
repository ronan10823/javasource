package basic;

import java.util.Scanner;

public class ScannerEx4 {
    // 이 코드가 최종으로 **** 매우 중요 **** 가장 기본적인 출력 방식
    public static void main(String[] args) {
        // Scanner 3 개선
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력 : ");

        // 입력 받기: sc.nextLine() -> "" String 문자열 형태로 받는다.
        // ""를 없애야 한다면, Integer.parseInt() or Float.parseFloat() or Double.parseDouble()을 통해 Int/float/double 등으로 바꿔주면 된다.
        
        // String num1  = sc.nextLine(); // ctrl + space = 명령어 자동완성
        // int input1 = Integer.parseInt(num1);
        // 위의 두 줄을 한 줄로 줄일 수 있다. 위의 경우, num1이라는 변수를 사용할 때만 사용
        int input1 = Integer.parseInt(sc.nextLine());
        // integer.parseInt() : String -> int로 변환
        // float input1 = Float.parseFloat(sc.nextLine()); // float(실수)로 전환
        // double input1 = Double.parseDouble(sc.nextLine()); // double(실수, 기본형)로 전환


        System.out.print("연산자 입력 : ");
        String op = sc.nextLine(); 
        System.out.print("두 번째 숫자 입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());

        System.out.println(op);
        System.out.println(input1 + input2);
        sc.close();
    }
}

// 동일한 클래스 아래 동일한 이름의 파일이 존재할 수 없다.
// 이 문서의 목적은, ScannerEx3.java의 문제점(문자열 입력 문제)을 해결하는 것
// 문자열 입력으로 연산을 하려고 한다면, nextLine()으로 받아서 처리해야 한다.
// integer.parseInt()는 입력한 내용이 반드시 숫자여야만 하며, 아닐 경우에는 숫자로 변환하지 못하기 때문에 오류가 발생한다.
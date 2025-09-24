package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner는 import java.util.Scanner;를 꼭 작성해야 한다.
        // 위의 명령문은 '사용자에게 입력'을 받기 위한 준비
        // println()= 출력 후 엔터 처리
        // print() : 출력(엔터 없음)
        // printf() : 포멧을 지정해서 출력(엔터 없음)
        System.out.print("두 자리 정수 입력 : ");
        // 사용자에게 입력을 받기 전에 출력하는 메시지
        
        String num = sc.nextLine(); // 35 입력 시, "35"로 출력, 왜? String으로 받기 때문
        // nextline은 String으로 받는다.
        // 어제 사용했던 nextInt()는 int로 받는다.
        System.out.println("num = " + num);
        System.out.println("num = " + (num + 1));
        // num = 35라는 걸 확인하는 것만으로는 괜찮지만, num+1을 하면 351이 된다.
        // String은 +가 연결의 의미이기 때문이다. = "35"+1= "351"
        // 그래서 String을 int로 바꿔줘야 한다.


        // "35" -> 35 로 바꾸는 방법
        int input = Integer.parseInt(num);
        // Integer.parseInt() : String을 int로 바꿔주는 명령어
        System.out.println("input = "+ input);
        System.out.println("input = "+(input+1));
        // input = 35, input = 36
        // input은 int이기에 +1을 하면 산수가 된다.        
        sc.close();
    }
}

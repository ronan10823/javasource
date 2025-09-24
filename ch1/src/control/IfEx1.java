package control;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        int x = 0;

        // x가 0과 동일하다면, x == 0으로 출력하고 싶음
        if (x == 0) {
            System.out.println("x == 0");
        }

        // x가 0과 동일하지 않으면, x != 0으로 출력하고 싶음
        if (x != 0) {
            System.out.println("x != 0");
        }

        // 사용자로부터 점수를 입력받아, 60점 이상이면 합격입니다 메시지 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = Integer.parseInt(sc.nextLine());
        if (score >= 60) {
            System.out.println("합격입니다");
        } else {
            System.out.println("불합격입니다");
        }
        // 삼항 연산자로도 대체 가능 (삼항 연산자가 if ~ else 구문의 간략한 버전)

        System.out.println(score >= 60 ? "합격입니다" : "불합격입니다");

        sc.close();
    }
}

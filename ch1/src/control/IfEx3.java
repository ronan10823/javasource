package control;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        // 중첩 if 구문
        // if 구문 내부에 또 다른 if 구문을 포함하는 형태(횟수 제한 없음)
        // if (true) {
        //     if () {
                
        //     } else {
                
        //     }
        // } else {
            
        // }


        // 점수 입력 받기
        // 90점 보다 크거나 같으면 A 학점
        // 90점 중에서 98점 이상은 A+ 학점
        // 95~97점 : A0 학점
        // 90~94점 : A- 학점
        // B도 마찬가지로 B+, B0, B- 학점

        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = Integer.parseInt(sc.nextLine());

        char grade = ' ', opt = '0';
        if (score >= 90) {
            grade = 'A';
            // opt = '0'; // 기본값를 0으로 그대로 둘건지, +나 -로 바꿀건지 결정
            if (score >=98) {
                opt = '+';
            } else if (score < 95) {
                opt = '-';
                // 만약 opt를 +, -로 바꾸지 않는다면, 기본값인 0으로 유지
            }
        } else if (score >=80) {    
            grade = 'B';
            // opt = '0'; // 기본값를 0으로 그대로 둘건지, +나 -로 바꿀건지 결정
            if (score >= 88) {
                opt = '+';
            } else if (score < 85) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.printf("학점 : %c%c", grade, opt);
        // %c : char 타입 출력

        
        sc.close();
    }
}

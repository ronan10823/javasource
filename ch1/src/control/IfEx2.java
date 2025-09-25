package control;

import java.util.Scanner;

public class IfEx2 {
    public static void main(String[] args) {
        // 점수를 입력받아, A, B, C, D 등급 출력하고 싶음
        // 90 이상 A, 80 이상 B, 70 이상 C, 나머지 D
        
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = Integer.parseInt(sc.nextLine());
        
        // if ~ else if ~ else 구문
        // if (score >=90) {
        //     System.out.println("등급 : A");
        // } else if (score >= 80) {
        //     System.out.println("등급 : B");            
        // } else if (score >=70) {
        //     System.out.println("등급 : C");
        // } else {
        //     System.out.println("등급 : D");
        // }
    // 이 중에서 하나의 구문만 실행됨
    // else 옆에 조건식을 붙일 수는 없음
        

        // 변수 유효 범위
        // 선언 위치에 따라 사용할 수 있는 범위가 달라짐
        
        // if 구문에서 등급은 한 번만 쓰고 싶다.
        char grade = ' ';
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("등급 : " + grade);
        // 변수 타입은 char
        // if 구문에서 grade라는 공통적인 변수를 사용하려면, if 내부가 아닌, 바깥으로 grade라는 변수를 빼면 된다. 특히, 위로. (중요!)
        // if 구문 내에서 선언된 변수는 if 구문 내부에서만 사용 가능 + if 구문 바깥에서 선언된 변수는 if 구문 내부에서도 사용 가능
        // 변수의 유효 범위(scope)는 변수가 선언된 위치에 따라 결정됨

        switch (score) {  // 이럴 땐 if else가 더 적합하다. 
            case 100:
            case 99:
                grade = 'A';
                break;
        
            default:
                break;
        }

        switch (score / 10) { // 그렇지만, 이렇게 좀 더 간단하게 바꿀 수도 있다.
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'D';
                break;
        }


        sc.close();
    }
}

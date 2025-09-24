package control;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        // 현재 월 입력받기
        // 월이 3, 4, 5 -> 현재 계절은 봄입니다.
        // 월이 6, 7, 8 -> 현재 계절은 여름입니다.
        // 월이 9, 10, 11 -> 현재 계절은 가을입니다.
        // 월이 12, 1, 2 -> 현재 계절은 겨울입니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("현재 월을 입력하세요. : ");
        int month = Integer.parseInt(sc.nextLine());

        // String season = "";
        // if (month >= 3 && month <= 5) {
        //     season = "봄";
        // } else if (month >= 6 && month <=8)  {
        //     season = "여름";
        // } else if (month >= 9 && month <=11) {
        //     season = "가을";
        // } else if (month == 12 || month == 1 || month == 2) {
        //     season = "겨울";
        // }
        // System.out.println("현재 계절은 " + season + "입니다.");



        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재 계절은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재 계절은 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("현재 계절은 가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("현재 계절은 봄입니다.");
                break;
            default: System.out.println("월을 확인해 주세요.");
                break;
        }



        // switch 구문은 if 구문과 유사한 형태의 제어문
        // switch 구문은 if 구문 중에서 if ~ else if 구문만 대체할 수 있다.
        // if 구문은 조건식에 true/false가 오지만, switch 구문은 정수, 문자열, 열거형이 올 수 있음

        sc.close();
        
    }
}

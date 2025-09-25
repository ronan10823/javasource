package control;

import java.util.Scanner;

public class ExamEx1 {
    public static void main(String[] args) {
        // 년도를 입력받아, 윤년인지 평년인지 출력
        // 윤년 : 2012년, 2016년, 
        // 년도를 4로 나눈 나머지가 0이고, 년도를 100으로 나눈 나무지가 0이 아니거나 
        // 년도를 400으로 나눈 나머지가 0이면 윤년
        
        // year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)

        Scanner sc = new Scanner(System.in);
        System.out.print("연도 입력 : ");
        int year = Integer.parseInt(sc.nextLine());

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }

        sc.close();
    }
}

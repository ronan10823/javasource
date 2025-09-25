package control;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        //세 개의 정수를 입력받아, 가장 작은 값 구하기

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력 : ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("두 번째 숫자 입력 : ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.print("세 번째 숫자 입력 : ");
        int c = Integer.parseInt(sc.nextLine());

        // if (a < b && a < c) {
        //     System.out.println("가장 작은 값 : a");
        // } else if (b < a && b < c) {
        //     System.out.println("가장 작은 값 : b");
        // } else {
        //     System.out.println("가장 작은 값 : c");
        // }

        int min = a;

        if (min > b) {
            min = b;
        } 
        if (min > c) {
            min = c;
        }
        System.out.println("가장 작은 수 " + min);



        // 큰 수
        int max = a;

        if (max < b) {
            max = b;
        } 
        if (max < c) {
            max = c;
        } 
        System.out.println("가장 큰 수 " + max);

        sc.close();
    }
}

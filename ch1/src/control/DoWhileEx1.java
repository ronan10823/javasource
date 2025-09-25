package control;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // do {
            
        // } while (condition);

        // 1 ~ 100 사이의 정수를 입력받기
        // 컴퓨터 임의의 수 : 1 ~ 100 사이의 정수
        // 컴퓨터가 생성한 임의의 수 맞추기(맞출 때까지 업다운 알려주기)
        
        int answer = (int)(Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int input = 0;
        do {
            System.out.print("1 ~ 100 사이의 정수를 입력 : ");
            input = Integer.parseInt(sc.nextLine()); 
            // Error : int input = Integer.pareInt(sc.nextLine()); 
            // 사용자 입력과 컴퓨터 생성한 임의의 수 비교 
            // 더 작은 수로 시도해 보세요 or 더 큰 수로 시도해 보세요
            if (input > answer) {
                System.out.println("더 작은 수로 시도해 보세요");
            } else if (input < answer) {
                System.out.println("더 큰 수로 시도해 보세요");
            }
            
        } while (answer != input);

        // } while (answer != input); > Error > input의 유효범위가 벗어났기 때문



    }
}

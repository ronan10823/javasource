package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {
        boolean run= true;
        Scanner sc = new Scanner(System.in);
        int balance = 0; // 잔액
        while (run) {
            System.out.println("--------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
            System.out.println("--------------------------------------");
            System.out.print("선택 : ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.print("입금액 : ");
                    int money = Integer.parseInt(sc.nextLine());
                    balance += money;
                    break;
                case 2:
                    System.out.print("출금액 : ");
                    // int money = Integer.parseInt(sc.nextLine()); 
                    // balance -= money;
                    // money라고 작성하면, 동일한 유효범위 내 moeny라는 변수를 두 번 썼기에 중복이라는 오류가 난다. 
                    // 그러면 그냥 한 줄로 합치면 된다. 
                    balance = Integer.parseInt(sc.nextLine());
                    break;            
                case 3:
                    System.out.println("잔액 : " + balance);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    break;
            }


        }
        
        // --------------------------------------
        // 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 
        // --------------------------------------
        // 선택 >>> 1
        // 입금액 >> 100000
        // 다시 메뉴로 되돌아가기

        // --------------------------------------
        // 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        // --------------------------------------
        // 선택 >>> 2
        // 입금액 >> 20000
        // 다시 메뉴로 되돌아가기

        // --------------------------------------
        // 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        // --------------------------------------
        // 선택 >>> 1
        // 입금액 >> 80000
        // 다시 메뉴로 되돌아가기

        // --------------------------------------
        // 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
        // --------------------------------------
        // 선택 >>> 4
        // 프로그램 종료

        sc.close();
       
    }
}

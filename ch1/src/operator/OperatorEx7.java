package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        // 사용자에게 키보드에서 숫자를 하나 입력받기
        
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int num = Integer.parseInt(sc.nextLine());
        // String num = sc.nextLine();
        // int input = Integer.parseInt(num);


        // 입력받은 숫자가 양수, 음수인지 출력하기
        System.out.println(num > 0 ? "양수" : "음수");

        sc.close();
    }
}

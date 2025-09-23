package basic;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력받기 코드 > 무조건 이거 쓰기
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        int input = sc.nextInt();
        // ()에 숫자를 넣으면, Int로 받아서 input에 넣을거다.(해석)
        System.out.printf("입력값 %d", input);
        sc.close();
    }
}

// a 입력시 나오는 것은 'rumtime error'라고 한다. InputMismatchException
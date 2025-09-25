package control;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        // 가위 바위 보
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 >> ");
        
        Scanner sc = new Scanner(System.in);
        int user = Integer.parseInt(sc.nextLine());

        // Math.random() : 임의의 수(난수) 추출, 0과 1 미만의 숫자를 자동으로 하나 출력
        // 0.0 <= Math.random() < 1.0
        // double com = Math.random(); // double 형태로 출력, random은 랜덤으로 뽑히는 것, 규칙: 0에서 1 미만의 숫자가 나온다.
        
        // 컴퓨터와 가위바위보 하고 싶음
        
        int com = (int)(Math.random() * 3) + 1; // 왜 3을 곱한 거지? // random 함수의 범위가 0<= Math.random()<3.0 사이이기에 3을 곱했다. 
        // System.out.println(com);

        // 누가 이겼니? 같냐, 다르냐부터 확인 
        switch (user - com) {
            case 2:
            case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 1:
            case -2:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("당신이 비겼습니다.");
                break;
        }
        sc.close();
    }
}

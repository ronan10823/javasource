package exam;

import java.util.Scanner;

public class CalEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Num1 : ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Num2 : ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Input operator : ");
        String op = scanner.nextLine();


        Calc calc = null; // 부모로 선언 -> setVakue는 어차피 

        switch (op) {
            case "+":
                calc = new Add(); // 객체만 생성
                break;
            case "-":
                calc = new Sub(); // new로 들어가는 애들이 누구인가? 
                break;
            case "*":
                calc = new Mul();
                break;
            case "/":
                calc = new Div(); 
                break;
            default:
                break;

        }
        calc.setValue(num1, num2);
        System.out.println(calc.calculate());

        scanner.close();
    }
}

package exam;

import java.util.Scanner;

public class CalEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Num1 : ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Num2 : ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Input operator : ");
        String op = scanner.nextLine();

        switch (op) {
            case "+" :
                Add add = new Add();
                add.setValue(num1, num2);
                System.out.print(add.calculate());
                break;
                case "-":
                Sub sub = new Sub();
                sub.setValue(num1, num2);
                System.out.print(sub.calculate());
                break;
                case "*" :  
                Mul mul = new Mul();
                mul.setValue(num1, num2);
                System.out.print(mul.calculate());
                break;
                case "/":
                Div div = new Div();
                div.setValue(num1, num2);
                System.out.print(div.calculate());
                break;
            default:
                break;

        }
        scanner.close();
    }
}

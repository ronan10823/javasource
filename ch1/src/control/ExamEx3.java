package control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {
        // 하루 일당 산출
        // 8시간 까지는 10030원, 
        // 8시간 이후에는 원래 받던 금액의 1.5배
        // 오늘 근무 시간을 입력받은 후, 하루 일당 산출
        // 일당은 정수형으로 만들기

        Scanner sc = new Scanner(System.in);
        System.out.print("하루 근무 시간은? : ");
        int hour = Integer.parseInt(sc.nextLine());

        // hour 10 : 8*10030 + (2 * 10030 * 1.5)
        // hour 8 : 8*10030

        int rate = 10030, pay = 0;
        if (hour > 8) {
            pay = rate * 8 + (int)((hour - 8) * rate * 1.5);
        } else {
            pay = rate * hour;
        }
        System.out.printf("근무시간 %d, 임금 %d", hour, pay);



        // if (hour <= 8) {
        //     System.out.printf("%d", (hour * 10030) );
        // } else if (hour >=8) {
        //     double pay = 80240 + ((hour - 8) * 1.5 * 10030);
        //     System.out.println((int)pay);
        // }



        sc.close();
    }
}

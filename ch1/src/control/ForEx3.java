package control;

public class ForEx3 {
    public static void main(String[] args) {
        // **********
        // **********
        // **********
        // **********
        // **********
    

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("s");
            }
            System.out.println();
        }
        
        // 1) 바깥쪽 for int i =0;
        // 2) 바깥 for i < 5
        // 3) 안쪽 fo j <10;
        // 4) 안쪽 for j <10;
        // 5) System.out.println(*args);
        // 6) 안쪽 for j++;
        // 7) 안쪽 for j<10;
        // 8) 6 ~ 8 수행
        // 9) j가 10이 되면 안쪽 for문 종료

        // *
        // **
        // ***
        // ...
        // *****

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
           // System.out.println(); 이건 왜 안 하지?
        }

    }
}

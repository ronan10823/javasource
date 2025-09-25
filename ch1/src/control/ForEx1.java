package control;

public class ForEx1 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            
        }



        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i + " 안녕하세요");
        // } // 안녕하세요 10번 출력

        // for (int i = 0; i < 10; i += 2) {
        //     System.out.println(i + " 안녕하세요");
        // } 

        // for (int i = 10; i > 0; i--) {
        //     System.out.println(i + " 안녕하세요");
        // }

        // for (int i = 10, j = 1; i > 0; i--, j++) {
            
        // }


        // 1 ~ 10 까지 출력
        // for (int i = 1; i < 11; i++) {
        //     System.out.print(i + " ");
        // }


        //  1~10 합계 구하기
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            //sum = sum + i;
            sum += i;
        }
        System.out.println("1 ~ 10까지 합 " + sum);
        // sum이라는 변수에 i를 루프마다 더하는 구문 작성
        // 1) int i = 1; 실행
        // 2) 조건식 true이면
        // 3) for 구문 안으로 진입 후 구문 실행
        // 4) i++ 실행



    }
}

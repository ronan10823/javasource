package control;

public class ExamEx6 {
    public static void main(String[] args) {
        //중첩 for 방정식 4x + 5y = 60 의 모든 해를 구해서 (x, y)형태로 출력
        // x와 y는 10 이하의 자연수

        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                if (4 * x + 5 * y == 60 ) {
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        } 
        // 내가 for문 안에 if를 넣을 생각을 못했어

    }
}

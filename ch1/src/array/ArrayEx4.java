package array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0]; // 직접 치면 안된다. 변수가 바뀔 수도 있기 때문. 
        int min = score[0]; 

        for (int i = 1; i < score.length; i++) {
          
            if (score[i] > max) {
                max = score[i];
            } else if(score[i] < min) {
                min = score[i];
            }
            // 전체 재공부
        }
        System.out.println("최대값 : " + max + ", 최소값 : " + min);
        // min과 max 출력
    }
}

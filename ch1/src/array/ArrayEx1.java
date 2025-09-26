package array;

public class ArrayEx1 {
    public static void main(String[] args) {
     // 배열(Array)   
        // 시험 점수 저장
        // 10명 학급
        // int score1 = 0, score2 = 0, score3 = 0; 등의 수많은 데이터를 일일이 계산할 수 없다. 

        int[] arr1 = new int[10]; //새로운 arr1이라는 int 타입의 변수에 10
        System.out.println(arr1[3]);

        double[] arr2 = new double[5];
        System.out.println(arr2[0]);

        boolean[] arr3 = new boolean[3];
        System.out.println(arr3[1]);

        char[] arr4 = new char[4];
        System.out.println(arr4[0] + "arr");

        /// 초기화 
        
        // arr1[0] = 88; 
        // arr1[1] = 90;
        // arr1[2] = 87;

        // 배열 선언, 생성, 초기화
        int score[] = {88, 90,87,86,77,78,79,75,72,66};
        int sum = 0;
        // int sum = score[0] + score[1] + ... + score[9];
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum / score.length);
    }
}

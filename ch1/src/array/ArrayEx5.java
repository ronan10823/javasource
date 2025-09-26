package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 10개의 정수를 담는 배열 선언
        // 각 요소는 0 ~ 9의 숫자로 초기화

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));


        // 교환!
        // int x = 10, y = 5;
        // x <=> y 값 교환하고 싶으면 temp를 하나 사용해서 한 변수의 값을 임시로 저장

        // int temp = x;
        // x = y;
        // y = temp;

        int n = 0;
        for (int i = 0; i < 100; i++) {
            n = (int)(Math.random() * 10);
            int temp = arr[0];
            arr[0] = arr[n];
            arr[n] = temp;
        }

       
        // for (int i = 0; i < 100; i++) {
            
        //     int num = (int)(Math.random() * 9 + 1);
        //     int temp = arr[num];
        //     arr[num] = arr[0];
        //     arr[0] = temp;
        // }
        // System.out.println(Arrays.toString(arr));

    }
}

package array;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {
        //45개의 정수값을 저장하기 위한 배열 생성

        int[] arr = new int[45];
        // 각 요소에 1 ~ 45 값 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }


        int n = 0;
        for (int i = 0; i < 6; i++) {
            n = (int)(Math.random() * 45);
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

        // 배열의 0번째에서 5번째 요소까지
        // 모두 6번만 교환

        // for (int i = 0; i < 6; i++) {
        //     int num = (int)(Math.random() * 45);
        //     int temp = arr[num];
        //     arr[num] = arr[45];
        //     arr[45] = temp;

            // 교환 위치 : 0 ~ 44 무작위 수
        } 
        // System.out.println(Arrays.toString(arr));
    }

// 반드시 복습해야 함
package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        
        int[] arr = new int[5]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; 
        }
        System.out.println(Arrays.toString(arr));


        //배열 복사 방법(1)
        int[] tmp = new int[arr.length * 2]; // 기존보다 2배 더 큰 공간 생성
        for (int i = 0; i < arr.length; i++) {  // *
            tmp[i] = arr[i];
        }
        System.out.println(Arrays.toString(tmp));
        
        
        //배열 복사 방법(2) 
        // System.arraycopy()
        
        int[] tmp2 = new int[arr.length * 2];
        System.arraycopy(arr, 0, tmp2, 0, arr.length);
        System.out.println(Arrays.toString(tmp2));


        // Error: ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 (범위 벗어났구나. 자주 뜨는 메시지)
        // for (int i = 0; i < tmp.length; i++) {
        //     System.out.println(arr[i]);
        // }

        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        // 배열 abc와 num을 하나의 배열로 만들기
        
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(Arrays.toString(result));
        // 다시 공부하기

    }
}

package util;

import java.util.Arrays;

public class ArraysEx4 {
    public static void main(String[] args) {
        int[] arr = {37, 21, 56, 99, 88, 58, 62, 15, 39, 78};
        // Integer[] arr = {37, 21, 56, 99, 88, 58, 62, 15, 39, 78};

        // 2. 검색
        //     ① 순차검색
        //         └ 데이터가 많을수록 효용성이 떨어진다.
        //     ② 이진검색
        //         └ 데이터를 반으로 나눠서 그 기준점과 비교하면서 검색
        //         └ 이진 검색을 하려면, 먼저 정렬이 필요
        Arrays.sort(arr);
        //      └ 먼저 정렬하고서 위치를 찾자.
        int pos = Arrays.binarySearch(arr, 62);
        System.out.println("62는 " + (pos+1)+"번째 위치함");
        //                              └ pos는 초기값이 0이기에, 원하는 값을 하려면 +1을 해줘야 한다.
        // --정렬을 안 하거나 배열에 없는 값을 찾으라고 하면 이상한 값을 출력한다.--

       
    }
}

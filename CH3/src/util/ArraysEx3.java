package util;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx3 {
    public static void main(String[] args) {
        Integer[] arr = {37, 21, 56, 99, 88, 58, 62, 15, 39, 78};

        // 정렬 - 선택정렬, 버블정렬, 퀵정렬...(정렬 알고리즘이 원래 존재한다.)
        Arrays.sort(arr);
        System.out.println("오름차순 정렬 후");
        System.out.println(Arrays.toString(arr));

        // ① 내림차순 정렬
        //     Arrays.sort(T[] a, Comparator<? super T>c);
        //                 T[] a -
        //     ⓐ int[] arr이 기본 타입이기에, sort의 매개변수로 하나밖에 쓸 수 없다. 
        //          └ Arrays.sort(arr, Comparator.reverseOrder()); > sort에 붉은줄
        //          └ int[] arr을 Integer[] arr로 변경
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println("내림차순 정렬 후");
        System.out.println(Arrays.toString(arr));


        String[] arr2 = {"good", "height", "dog", "lion", "cat", "zero", "zoo"};
        Arrays.sort(arr2);
        //       └ sort에서 매개변수를 하나만 써서 오류가 나지 않는다. 
        //       └ 이렇게 하나만 하는 경우, sort(Object[] a)가 된다. 
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, Comparator.reverseOrder());
        //                    └ Comparator.reverseOrder()가 역순
        System.out.println(Arrays.toString(arr2));
    }
}

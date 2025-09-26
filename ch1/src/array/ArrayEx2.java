package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 'a', 'b', 'c', 'd', ...
        char[] arr1 = {'a', 'b', 'c', 'd'};
        
        double[] arr2 = {99.8, 85.2, 77.8, 63.8};

        String[] arr3 = {"bear", "snow", "sun"};

        // 1~10 임의의 수 생성 후 초기화, 10개 
        // 이럴 땐 생성까지만 하면 된다.
        int[] arr4 = new int[10]; 
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int)(Math.random() * 10) + 1;
        }


        // 배열 길이가 명확하지 않은 경우 -> 입력값으로 결정
        int[] arr5;  

        Scanner sc = new Scanner(System.in);
        System.out.print("배열 길이 입력 : ");
        int length = sc.nextInt();
        arr5 = new int[length];

        // 배열 확인(=출력)
        
        // 그냥 입력 시, 배열이 가지고 있는 주소값 출력
        // System.out.println(arr2); // abcd
        // System.out.println(arr2); // [D@6d03e736
        // System.out.println(arr3); // [Ljava.lang.String;@568db2f2
        // System.out.println(arr4); // [I@378bf509
        // System.out.println(arr5); // [I@5fd0d5ae

        // Arrays.toString() : 배열이 가지고 있는 실제 값 출력 < 확인하는 용도로 주로 사용
        System.out.println(Arrays.toString(arr1)); // [a, b, c, d]
        System.out.println(Arrays.toString(arr2)); // [99.8, 85.2, 77.8, 63.8]
        System.out.println(Arrays.toString(arr3)); // [bear, snow, sun]
        System.out.println(Arrays.toString(arr4)); // [4, 2, 4, 4, 6, 3, 5, 2, 2, 5]
        System.out.println(Arrays.toString(arr5)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        // for 출력 < 일반적으로 더 많이 사용됨
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr3[i]); // 무조건 차례대로 가지고 나오는 것
        }
        
        for (int i : arr5) {  // arr5이 int로 선언되었기에, 첫 항에 int가 쓰임
            System.out.println(i);
        }

        // 향상된 for문
        for (String str : arr3) {
            System.out.println(str);
        }

        for (char ch : arr1) {
            System.out.println(ch);
        }

        sc.close();
    }
}

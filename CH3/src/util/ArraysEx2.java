package util;

import java.util.Arrays;

public class ArraysEx2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 2, 3, 4};

        boolean result = Arrays.equals(arr1, arr2); // 배열의 두 인자를 비교
        System.out.println(result ? "배열요소 같음" : "배열요소 다름"); // 배열요소 다름

        // 2차원 배열
        int[][] original = { {1, 2}, {3, 4} };
        // 새로운 배열을 복사해서 만들고 싶다. 
        int[][] cloned = Arrays.copyOf(original, original.length);

        System.out.println("주소 "+original.equals(cloned)); // eqals 오버라이딩 안 되어있어 주소 비교 -> false
        System.out.println(Arrays.equals(original, cloned) ? "배열요소 같음" : "배열요소 다름"); // 배열요소 같음

        // // copyOf가 복사를 하는 방법
        //      ① 얕은 복사 : copyOf() -> 주소 비교
        //         1. original에 주소가 담김, heap에 값(1, 2) 등이 담김
        //         2. copy는 주소(0X100)을 그대로 복사한다. 
        //         3. 동일한 배열, 주소도 동일하게 (원본과 복사본이 실시간 동기화된다고 보면 될듯 / 듀얼 모니터 화면 복제)
        //         4. Arrays.equals(original, cloned)를 물어보면 동일할 수밖에 없다.
        
        System.out.println("깊은 복사");
        int[][] cloned2 = Arrays.copyOf(original, original.length);
        cloned2[0] = Arrays.copyOf(original[0], original[0].length);
        cloned2[1] = Arrays.copyOf(original[1], original[1].length);
        System.out.println("주소 " + original.equals(cloned2));   // 주소 false
        
        System.out.println(Arrays.equals(original, cloned2) ? "배열요소 같음" : "배열요소 다름");  // 배열요소 다름
        //         1. 2차원 배열의 cloned2[0]이 행이고, original[0].length는 열로 추측된다. 그래서 1x2열이 완성
        //         2. cloned2[1]까지 실행되면 2x2행에 모두 값이 복사된다. 
        //         3. 서로 다른 주소에 저장되기에, 배열요소가 다르다고 나온다. 
        
        
        //      ② 깊은 복사 : 새 공간 생성 + 값 옮기기 (듀얼 모니터 화면 확장)
        System.out.println(Arrays.deepEquals(original, cloned2) ? "배열요소 같음" : "배열요소 다름");  // 배열요소 같음
        // 

    }
}

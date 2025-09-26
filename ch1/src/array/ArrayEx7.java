package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        String[] strArr = {"Kim", "Park", "Lee"}; 
        System.out.println(strArr[0].length());
        
        
        System.out.println(Arrays.toString(strArr));
        //char 배열과 String 배열 (대문자-참조형 애들은 다 주소 있음)
        //String : char 배열 + 기능(메서드)
        
        String[] strArr2 = new String[3];
        strArr2[0] = "Kim";
        strArr2[1] = "Park";
        strArr2[2] = "Lee";

        System.out.println(strArr2[0]); // Kim
        System.out.println("strArr2[0].charAt(0) " + strArr2[0].charAt(0));  // K

        String src = "ABCDE";
        for (int i = 0; i < src.length(); i++) {
            System.out.println(src.charAt(i));
        }

        // String -> char 배열
        char[] chArr = src.toCharArray();

        // char 배열 -> String 
        char[] chArr4 = {'A', 'B', 'C', 'D', 'E'};
        String str2 = new String(chArr4);
        System.out.println(str2);

        // String str = "java";  // 값을 저장
        // String str2 = new String("java"); // 주소를 저장

    }
}

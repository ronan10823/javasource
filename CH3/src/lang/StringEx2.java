package lang;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
     // 1. concat() : 다른 문자열 뒤에 덧붙이기
        String str1 = "Hello";
        String str2 = "World";   
        String str3 = str1 + str2;
        System.out.println(str3);
        str1.concat(str2);
        System.out.println("concat() " + str1.concat(str2));

        // 2. contains() : 문자열 포함 여부
        // boolean result = str3.contains(str1);
        // System.out.println(result);

        if (str3.contains(str1)) {
            System.out.println("str3 문자열에 str1 문자열이 포함됨");
        } else {
            System.out.println("str3 문자열에 str1 문자열이 포함되지 않음");
            }

        // 3. compareTo() : 문자열을 사전 순서로 비교
        str1 = "aaa";
        str2 = "bbb";
        System.out.println("str1.compareTo(aaa) = " + str1.compareTo("aaa"));
        System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2));
        System.out.println("str2.compareTo(str1) = " + str2.compareTo(str1));

        // 4. endWith() : 지정된 문자열로 끝나는지 검사
        String fileName = "file1.txt";
        fileName.endsWith(fileName);

        if (fileName.endsWith("txt")) {
            System.out.println("텍스트 파일");
        } else {
            System.out.println("텍스트 파일 아님");
        }

        // 5. equals() : 문자열 비교, equalsIngoreCase() : 대소문자 구별 없이 비교
        System.out.println("aaa".equals("cccc"));
        System.out.println("aaa".equalsIgnoreCase("AAA"));

        // 6. indexOf() : 문자열에서 문자의 위치값 리턴 (처음부터 찾음)
        str1 = "Hello";
        System.out.println("str1.indexOf('e') " + str1.indexOf('e'));
        System.out.println("str1.indexOf('k') " + str1.indexOf('k'));
        System.out.println("str1.indexOf('e', 2) " + str1.indexOf('e', 2));
        System.out.println("str1.indexOf('e', 2) " + str1.indexOf("el"));

        // 7. lastIndexOf() : 문자열에서 문자의 위치값 리턴 (마지막-오른쪽-에서부터 찾음)
        str1 = "java.lang.Object";
        System.out.println("str1.lastIndexOf('.') " + str1.lastIndexOf('.'));
        System.out.println("str1.IndexOf('.') " + str1.indexOf('.'));

        // 8. length() : 문자열 길이 반환
        int arr[] = {3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) { }
        
        // 9. replace()
        str1 = "Hello";
        System.out.println(str1.replace('H', 'K'));
        System.out.println("Hellollo".replace("ll", "LL"));
        System.out.println("Hellollo".replaceAll("ll", "LL"));
        System.out.println("Hellollo".replaceFirst("ll", "LL"));

        // 10. split()
        String animals = "dog,cat,bear";
        String[] arr2 = animals.split(",");
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));
        for (String s : arr2) {
            System.out.println(s);
        }

        String[] arr3 = animals.split(",", 2);
        // System.out.println("animals.split(, 2) "+Arrays.toString(arr3));
        for (String s : arr3) {
            System.out.println(s);
        }


        // 11. startsWith()(prefix) : 앞쪽의 문자열 prefix이 일치하는가 ↔ endWith()
        str1 = "java.lang.Object";
        System.out.println("str1.startsWith(java) "+str1.startsWith("java"));
        System.out.println("str1.startsWith(lang) "+str1.startsWith("lang"));
        System.out.println("str1.startsWith(lang) "+str1.startsWith("lang", 5));
        
        
        // 12. subString()
        str1 = "java.lang.Object";
        System.out.println(str1.substring(10));
        System.out.println(str1.substring(5, 9));

        // 13. toLowerCase()  / toUpperCase()
        System.out.println("abcdefg".toUpperCase());
        System.out.println("ABCDEFG".toLowerCase());

        // 14. trim() : 양 끝에 존재하는 공백 제거(중간 공백은 제거 안 해줌)
        System.out.println("       Hello  World  ".trim());

        // 15. valueOf() : 지정된 값을 문자열로 변환하여 반환
        String str4 = String.valueOf(5);
        int i = 3;
        str4 = i + "";
        str4 = String.valueOf(10.3f);

    }
}

package lang;

public class StringEx1 {
    public static void main(String[] args) {
        // 1. 인스턴스 생성
        // // 1-1) 정식 방법
        // String str1 = new String("abc");
        // // 1-2) 간단한 방법(일반적)
        String str1 = "abc";

        // 기능(목적) : 문자 낱개로 처리 -> "abc" > 'a', 'b', 'c' : charAt
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        char[] ch = {'A', 'B', 'C', 'D'};
        // cha 배열 -> 문자열로 변경
        String str2 = new String(ch);
        System.out.println(str2);
    }
    
}

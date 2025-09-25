package basic;

// 기존에 배웠던 타입은 '기본 타입()'이라고 불린다.
// 자바의 타입 
// 1. 기본 타입 : byte, short, int, long, float, double, char, boolean
// 2. 참조 타입 : 기본 타입을 제외한 모든 타입(대문자로 시작)

public class StringEx1 {
    public static void main(String[] args) {
        // 문자열 : ""
        String str1 = "안녕하세요"; 
        String str2 = "안녕하세요"; 
        
        // 문자열이 같은가? 비교하고 싶다. ==, != 
        System.out.println(str1 == str2 ? "문자열이 같다" : "문자열이 다르다");
        String str3 = new String("안녕하세요");
        System.out.println(str1 == str3 ? "문자열이 같다" : "문자열이 다르다");

        // 문자열을 만드는 방법은 두 가지. 각 방법은 메모리 내 사용되는 공간이 다르다.
        // 어찌되었든 들어간 내용이 동일하기에 '문자열이 같다'고 나오도록 하고 싶다.

        //equals
        System.out.println("equals 사용");
        System.out.println(str1.equals(str3) ? "문자열이 같다" : "문자열이 다르다"); 

        String str4 = "abc", str5 = "ABC";
        System.out.println(str4.equals(str5) ? "abc == ABC" : "abc != ABC"); // 영어일 때만 의미가 있음. 대소문자 구분하는 특성 때문
        System.out.println(str4.equalsIgnoreCase(str5) ? "abc == ABC" : "abc != ABC"); // 대소문자 무시하고 싶을때 IgnoreCase 사용
    }
}

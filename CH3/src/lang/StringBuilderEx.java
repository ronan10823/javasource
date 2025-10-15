package lang;

public class StringBuilderEx {
    public static void main(String[] args) {
        // 다른 클래스 쓰려면 반드시 
        // 1. 인스턴스 생성

        StringBuilder builder = new StringBuilder();
        // StringBuilder builder2 = "new StringBuilder()";

        String str1 = "abc";
        String str2 = str1.concat("bcd"); // 

        builder.append("abc").append("bcd").append("def");
        System.out.println(builder);

        builder.delete(0, 2);
        System.out.println(builder);

        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.insert(1, "홍길동");
        System.out.println(builder);
        
        builder.replace(1, 3, "성춘향");
        System.out.println(builder);
        
        builder = new StringBuilder("Hello");
        StringBuilder builder2 = new StringBuilder("Hello");

        System.out.println(builder.equals(builder2) ? "같음" : "다름");
        // StringBuilder => String 개체로 변경

        str1 = builder.toString();
        str2 = new String(builder2); 
        System.out.println(str1.equals(str2));

        String str3 = "안녕하세요";
        str3 += "반갑습니다";
        str3 += "Hello";
    }
}

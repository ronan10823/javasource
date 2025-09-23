package basic;

public class Variable2 {
    public static void main(String[] args) {
        // long 활용(8byte): L, l을 붙이지 않는 경우, long의 경우에도 INT 타입의 범위를 벗어나지 않아야 함
        long num = 10;
        // long num2 = 1000000000000;
                // Error: INT의 범위를 벗어났음, The literal 1000000000000 of type int is out of range Java(536871066)
        long num3 = 1000000000000L; 
                // Error가 났던 이유: 뒤에 L(l)을 붙이지 않아서
                // L을 붙이는게, Long이라는 걸 알려주는 것
                // 웹 서비스 만들때 많이 사용한다.
        System.out.println(num+" "+num3);
        System.out.println(num+" "+num3);
    }
}

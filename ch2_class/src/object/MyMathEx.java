package object;

public class MyMathEx {
    public static void main(String[] args) {
        // MyMath 인스턴스 생성
        MyMath myMath = new MyMath();

        // 메소드 호출
        // void가 아니므로, 
        // 1) 변수에 받기
        // 2) 출력문

        long result = myMath.add(12, 63);
        // 위의 메소드가 실행 > long add라는 메서드가 실행, long a, long b, a + b 값이 return됨
        System.out.println("덧셈 결과 : " + result);

        result = myMath.subtract(85, 35);
        System.out.println("뺄셈 결과 : " + result);

        result = myMath.multiply(9, 12);
        System.out.println("곱셈 결과 : " + result);

        double results = myMath.divide(36, 4);
        System.out.println("나눗셈 결과 : " + results);


    }
}

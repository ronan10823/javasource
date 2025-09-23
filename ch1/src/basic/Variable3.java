package basic;

public class Variable3 {
    public static void main(String[] args) {
        // 실수형: float, double(기본 타입)
        // float score1 = 50; // 출력값이 50이 아닌, 50.0으로 나옴
        float score1 = 50.15F; 
        // float score1 = 50.15; 
        // Error: Type mismatch: cannot convert from double to floatJava(16777233)
        // 왼쪽과 오른쪽의 타입이 다르다. 소수점을 쓰는 순간 double로 인식, 8byte를 4byte로 표현할 수 없음(저장 시 데이터 손실이 일어남)
        // float : f, F를 붙여야 한다.
        // double : d, D를 붙인다. (d, f등은 내부적으로 구분하기 위한 기호)
        double score2 = 45.125d; // 출력값 45.125
        System.out.println("score1 = "+score1); // score1 = 50.15
        System.out.println("score2 = "+score2); // score2 = 45.125
        System.out.printf("score1 = %f, score2 = %f\n", score1, score2); // score1 = 50.150002, score2 = 45.125000
        // ln을 쓸 때와 다르게 f를 쓰니 소수점 6자리까지 나옴
        //score 1은 소수점 6자리 수가 2로, 다르게 나옴 = float와 double의 차이 > double을 써야 원래 숫자를 그대로 온전히 출력 가능, float는 조금 불완전해서 0002 등으로 나올 수 도 있다. (기본적인 컴퓨터 상황)
        System.out.printf("score1 = %.2f, score2 = %f\n", score1, score2); // score1 = 50.15, score2 = 45.125000
        // .2f 소수점 2자리까지만 보고 싶다
        System.out.printf("score1 = %10.2f, score2 = %f\n", score1, score2); // score1 =      50.15, score2 = 45.125000
        // 10.2f = 10칸 중에서 소수점 2자리 할당해줘
        // %10.2f : %전체자릿수.소수점자릿수
    }
}

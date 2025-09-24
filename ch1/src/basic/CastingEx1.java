package basic;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        // int score = d; // Type mismatch: cannot convert from double to int, 원래는 Double -> int로 변환 불가
        int score = (int) d; // 강제로 형 변환(casting)
        System.out.printf("d = %f, score = %d\n", d, score); // d = 85.400000, score = 85
        // double -> int로 변환 시, 소수점 이하는 버려진다. (반올림 아님) 손실을 감수하고 변환하는 것
    }
}

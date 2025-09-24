package basic;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = i ; // 앞에 (int)가 없지만, 자동 형 변환이 일어난다.
        // 자동 형변환(promotion): 작은 크기의 자료형 -> 큰 크기의 자료형으로 변환할 때 자동으로 변환된다.
        int i2 = (int) f; 
        // int i2 = f;일때, float(실수)가 int(정수)보다 더 크기 때문에 오류 발생, 강제로 변환해야 한다.

        double d = i ; // int -> double 자동 형 변환
        int i3 = (int) d; // double -> int 강제 형 변환 필요

        // 형변환 가능 기본 타입
        // byte < short < int(4byte) < long < float < double (자동 형변환 순서, 반대의 경우 강제 형변환, boolean 제외)
        //        char
    }
}

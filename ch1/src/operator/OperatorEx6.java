package operator;

public class OperatorEx6 {
    public static void main(String[] args) {
        // 대입 연산자 : =
        // 복합대입연산자 : +=, -=, *=, /=, %=

        int i = 3;
        i = i + 5; 
        // i에 5를 더한 후, i에 다시 저장 < 이 식을 만들고 싶지만, i와 i가 반복되어 헷갈릴 수 있다.
        i += 5; // i = i + 5; i에 5를 더한 후, i에 다시 저장
        i -= 2; // i = i - 2; i에서 2를 뺀 후, i에 다시 저장
        i *= 3; // i = i * 3; i에 3을 곱한 후, i에 다시 저장
        // 산술 연산하고 같이 사용하기도 한다. 
    }
}

package object;

public class MethodTest {
    // 두 개의 인자(== 매개 변수)를 받아서 덧셈 후 덧셈 결과 리턴 (기능=메소드)
    int sum(int num1, int num2) {
        // int result = num1 + num2;
        // return result;
        return num1 + num2;
    }

    // 두 개의 인자를 받아서 뺄셈 후 뺄셈 결과 리턴
    double subtract(double num1, double num2){
        return num1 - num2;
    }

    // 두 개의 인자(float 타입)를 받아서 나눗셈 후 나눗셈 결과 리턴
    float divide(float num1, float num2) {
        return num1 / num2;
    }

    // 두 개의 문자열 인자를 받아서 하나의 문자열로 리턴
    String concat(String str1, String str2){
        return str1 + str2;
    }

    // 한 개의 int 타입의 배열을 받아서 배열을 리턴
    // int 타입 배열 선언시, int [] arr = new int[3];
    
    int[] call(int[] arr){
        return arr;
    }
    // **int[]가 타입이다. 그래서 그 앞에 int[] 자체를 붙여주는 거다. 

    // **인자는 안 받아도 된다. 
    String print(){
        return "안녕하세요";
    }

    // **중괄호의 여부에 따라서 
    // (변수) 변수에는 변수의 유효범위가 있다. 이들의 유효범위는?
    // => 다음 중괄호 안에서만 사용 가능하다. 

}

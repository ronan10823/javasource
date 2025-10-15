package lang;

public class Test {
    private boolean result; // 기본 타입으로 선언할건지
    private Boolean result2; // 객체 타입으로 선언할건지 선택 가능
    // 두 타입에서 크게 다르지는 않다. 
    // 객체 타입에서는 각 타입의 메소드를 사용할 수 있기는 하다. (선택지 넓어짐)

    public boolean isResult() {  // 객체로 만들었기에 isResult로 get이 나온다. 
        return result;
    }
    public void setResult(boolean result) {
        this.result = result;
    }
    public Boolean getResult2() {
        return result2;
    }
    public void setResult2(Boolean result2) {
        this.result2 = result2;
    }

}

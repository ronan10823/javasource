package exam;

public abstract class Calc {

    protected int a;
    protected int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    abstract int calculate(); 
    // 하위 자식 파일에서 알아서 새로 만들것이기에, 부모에서 무언가 만들지 않아도 된다. 
}

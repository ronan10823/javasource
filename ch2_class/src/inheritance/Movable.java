package inheritance;

public interface Movable {

    int pos = 0;

    // abstract이 없어도 추상 메서드로 인식
    void move(int x, int y);

    // static, default 를 무조건 붙여야 한다. 
    static void print(){
        };

    default void print2(){
        };  

}

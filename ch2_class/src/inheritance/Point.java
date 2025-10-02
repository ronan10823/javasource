package inheritance;

public class Point {
    int x; // x좌표
    int y; // y좌표

    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Point() {
        this(0, 0); // default로 setting하고 싶은 값이 있다면, 다시 호출해서 사용하는 방법도 있다.
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    
}

package inheritance;

public class Circle extends Shape {
    // int x; // 원점의 x좌표
    // int y; // 원점의 y좌표
    Point point = new Point(); // 포함관계
    int r; // 반지름

    // 1-1) 생성자로 초기화
    // public Circle(Point point, int r) {
    //     this.point = point;
    //     this.r = r;
    // }

    // x, y, color 출력 -> 오버라이딩

    @Override
    void draw() {
        System.out.printf("[x = %d, y = %d, color = %s]", point.x, point.y, color);
    }
    
}

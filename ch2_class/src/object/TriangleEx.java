package object;

public class TriangleEx {
    public static void main(String[] args) {
        
        // 삼각형 너비를 구하기 위해서는 입력이 필요하다. 
        // 이를 위해 변수(속성, 멤버 변수) 초기화가 필요

        // 1. 직접 접근(속성)
        // Triangle triangle1 = new Triangle(); 1. 직접 접근(defualt)
        //  triangle1.baseLine = 12;
        //  triangle1.height = 6;
        //  잘 안하는 이유 : 클래스를 감추는게 일반적이기 때문, 감추면 직접접근 불가
        
        // 2. 생성자 사용
        
        Triangle triangle1 = new Triangle(12, 6);
        // triangle1.getArea(0, 0); 
        // getArea 호출하면, 
        System.out.println("넓이 : " + triangle1.getArea());

        // 3. setter 메소드
        Triangle triangle2 = new Triangle();
        triangle2.setBaseLine(10);
        triangle2.setHeight(5);
        System.out.println("넓이 : " + triangle2.getArea());



    }
}

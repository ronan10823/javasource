package object;

public class CarEx {
    public static void main(String[] args) {
        // 인스턴스 생성 : 생성자가 내부적으로 호출된다.
        Car car = new Car();

        car.companyName = "현대";
        car.model = "아반떼";
        car.color = "white";
        car.maxSpeed = 200;
        System.out.println(car);
        // car.java의 car()이라는 생성자가 내부적으로 호출

        // 현대자동차 아반떼 흰색, 200
        // 멤버 변수 초기화 방법(1) 직접 접근(거의 사용 안함, X)

        // 2. setter 메소드
        // 3. 생성자

        Car car2 = new Car("기아");
        System.out.println(car2);
    
        
        Car car3 = new Car("현대", "소나타");
        Car car4 = new Car("현대", "아이오닉", "gray");
        Car car5 = new Car("현대", "포터", "white", 150);


        System.out.println("car3 " + car3);
        System.out.println(car4);
        System.out.println(car5);
        
        car3.setColor("green");
        // set 메서드로 초기화도 할 수도 있지만, 기존값을 변경할 수도 있다. 
        // set 메서드 : 입력 X => 초기화
        // set 메서드 : 입력 O => 기존값 변경
        System.out.println("색상 지정 후 car3 " + car3);
    }
}

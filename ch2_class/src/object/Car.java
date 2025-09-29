package object;

public class Car {
    // 속성: 제조사명(현대), 모델명(아반떼), 색상(red), 최대 속도(200) 결정 후

    // 멤버 변수 (1번째로 작성)
    String companyName;
    String model;
    String color;
    int maxSpeed;
    // 생성자 : 여러 개 작성 가능
    // 멤버 변수 초기화를 목적으로 새로운 생성자 작성 > 괄호 안에 새로운
    //          클래스 이름과 동일해야 한다. 
    //          리턴 값이 없다. 
    // default(기본) 생성자 
    Car() {
        
    }


    
    public Car(String companyName) {
        this.companyName = companyName;
    }

    
    public Car(String companyName, String model) {
        this.companyName = companyName;
        this.model = model;
    }


    public Car(String companyName, String model, String color) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
    }


    public Car(String companyName, String model, String color, int maxSpeed) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }



    // 2. setter 메소드 실행을 위해 class에 setter 메소드가 있어야 한다. 
    // 기능 
    void forward(){
        System.out.println(this.model+ " 전진한다");
    }
    
    void backward(){
        System.out.println(this.model+ " 후진한다");
    }

    void turn(){
        System.out.println(this.model+ " 회전한다");
    }


    

    // 4. 메소드 만들기 
    public String getCompanyName() {
        return companyName;
    }



    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }



    public String getModel() {
        return model;
    }



    public void setModel(String model) {
        this.model = model;
    }



    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }



    public int getMaxSpeed() {
        return maxSpeed;
    }



    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



    @Override
    public String toString() {
        return "Car [companyName=" + companyName + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
                + "]";
    }


    

}

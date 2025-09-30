package object;

public class Triangle {
    // 속성 : 밑변(baseLine), 높이(height)
    double baseLine;
    double height;
    
    // 기능 : 삼각형 너비(getArea())
    // double getArea(double baseLine, double height){
    //     return baseLine * height / 2 ;
    
    //2. 생성자 사용
    // 2-1) 
    double getArea(){
        return baseLine * height / 2 ;

    }


    // 2-2) 중요! Construction 만들때, 전체 체크 하나, 전체 해제 하나 만들기!    
    public Triangle() {
    }

    public Triangle(double baseLine, double height) {
        this.baseLine = baseLine;
        this.height = height;
    }


    //3. setter 메서드

    public void setBaseLine(double baseLine) {
        this.baseLine = baseLine;
    }
    public void setHeight(double height) {
        this.height = height;
    }





}

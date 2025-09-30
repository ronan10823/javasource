package object;

public class CalcEx {
    public static void main(String[] args) {
        // 외부에서 Calc 내부의 plus를 사용하고 싶어요. > 인스턴스 생성
        Calc calc = new Calc();
        // calc.avg(15, 8);
        // 평균을 구하는 메소드 호출
        calc.execute(); // 호출하면 void execute 호출, 
        
    }
}

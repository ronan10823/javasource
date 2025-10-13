package inheritance;

public class FighterEx {
    public static void main(String[] args) {
        // Attackable attackable = new Attackable(); -> 인스턴스 생성이 불가하다고 에러 메세지가 뜬다. 
        // 추상 클래스, 인터페이스는 직접적으로 인스턴스 생성은 불가능하다. 
        // 부모의 목적으로만 사용될 수 있다. 

        Fightable fightable = new Fighter(); 
        Fightable fighter = new Fighter();
    }
}

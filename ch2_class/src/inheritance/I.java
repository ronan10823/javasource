package inheritance;

public interface I {
    void methodB();
    // interface를 만들어서, I를 상속한 자식 중 하나인 B를 methodB로 호출
    // 이러한 methodB이 호출되면 오버라이딩된 자식의 메서드가 호출
}

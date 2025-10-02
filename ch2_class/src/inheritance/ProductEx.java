package inheritance;

public class ProductEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        // 삼성TV와 컴퓨터를 둘 다 사고싶다. 
        buyer.buy(new SamsungTV(300));
        buyer.buy(new Computer(200));
        System.out.println("잔액 : " + buyer.money);
        System.out.println("보너스포인트 : " + buyer.bonusPoint);
    }
}

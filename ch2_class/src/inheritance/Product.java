package inheritance;

public class Product {
    int price;
    int bonusPoint;

    
    
    public Product(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }



    // 구매하다 > 메소드로 만들지 X, 클래스로 만들기 


}

package object;

public class GoodsEx {
    public static void main(String[] args) {
        GoodsStock goodsStock = new GoodsStock("p-0001", 35);
        GoodsStock goodsStock1 = new GoodsStock();
        goodsStock1.setName("p-0002");
        goodsStock1.setAmount(40);
        // The constructor GoodsStock() is undefined 
        // > 생성자가 이미 하나가 있기 때문에, 비어있으면 오류가 발생
        // 외부에서 생성자를 어떤 방식으로 형성할것인가를 결정해야 한다. 
        // 생성자는 new 딱 한 번 실행되고 더 이상 실행되지 않는다.
        // goodsStock1의 이름과 수량을 입력하기 위해 setter 메서드를 입력해야 한다. 


        // 재고 > 판매로 인해 재고가 줄어든다면?
        // 매서드로 이용해야 한다.


        System.out.println(goodsStock);
        System.out.println(goodsStock1);
    }
    
}

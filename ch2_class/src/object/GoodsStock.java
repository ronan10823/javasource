package object;

public class GoodsStock {
    // 속성: 상품명(p0001), 수량(10)

    String name;
    int amount;
    
    // 기본 생성자만 필요하다. 하면 
    // => 1) 내가 명시하는 방법, 2) 컴파일러에게 자동으로 생성하게 하는 방법
    
    public GoodsStock() {
    };
    
    
    // 두 멤버 변수를 초기화하는 멤버 변수가 필요하다. 하면
    public GoodsStock(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    
    // setter, getter 메소드
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAmount() {
        return amount;
    }


    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "GoodsStock [name=" + name + ", amount=" + amount + "]";
    }




    

    
    

}

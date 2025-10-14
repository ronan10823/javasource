package shop;

public class Cellphone extends Product {
    private String carrier;
    
    public Cellphone(String name, int price, String carrier) {
        super(name, price);
        this.carrier = carrier;
    }


    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrier() {
        return carrier;
    }

    @Override
    void printExtra() {
        System.out.println("통신사 : "+carrier);
    }
    
}

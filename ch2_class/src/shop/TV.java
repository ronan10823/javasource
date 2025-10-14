package shop;

public class TV extends Product {
    //해상도와 해상도 출력 메소드만 재정의해주면 된다.
    private String resolution;

    public TV(String name, int price, String resolution) {
        super(name, price);
        this.resolution = resolution;
    }


    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    
    public String getResolution() {
        return resolution;
    }

    @Override
    void printExtra() {
        System.out.println("해상도 : " + resolution);
    }
    


}

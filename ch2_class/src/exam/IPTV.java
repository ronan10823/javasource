package exam;

public class IPTV extends ColorTV {

    private String ip;

    public IPTV(int size, int color, String ip){
        super(size, color);
        this.ip = ip;
    }

    @Override
    public void printProperty() {
        // System.out.println("나의 IPTV는 " + this.ip + " 주소의 " + super.getSize() + "인치 " + getColor() + "컬러");
        System.out.print("나의 IPTV는 " + this.ip + " 주소의 ");
        super.printProperty();
    }
    // this.ip가 아닌, ip로 작성했다. 유의하자.
    // super을 붙여주는 편이 더 낫지 않을까. 상속받는 것에 대해서 더 생각해보도록 하자. 
    
}

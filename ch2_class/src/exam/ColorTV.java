package exam;

public class ColorTV extends TV {

    private int color;

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }
    
    public void printProperty() {
        System.out.println(super.getSize() + "인치 " + color + "컬러");
    }
    // super 호출해도 되고, 안해도 된다. 

    public int getColor() {
        return color;
    }

    
}

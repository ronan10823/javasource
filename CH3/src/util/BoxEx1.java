package util;

public class BoxEx1 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.setItem("홍길동"); // new String("홍길동")
        box1.getItem(); // Object를 return한다고 되어있다. 

        String name = (String) box1.getItem();
        System.out.println(name);
        
        box1.setItem(33); // Integer.valueOf(33)
        Integer i = (Integer) box1.getItem();
        
        box1.setItem(33.14); // Double.valueOf(33.14) 내부적으로는 이렇게 바뀌어서 들어간다. 
        Double d = (Double) box1.getItem();
        

        Box2<String> box2 = new Box2<>();
        box2.setItem(name);
        String data = box2.getItem();
    }
}

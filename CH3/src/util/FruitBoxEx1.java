package util;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3<>();
        Box3<Apple> appleBox = new Box3<>();
        Box3<Grape> grapeBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); //  자녀도 담을 수 있다. 
        fruitBox.add(new Grape()); // 어떤 타입을 담을지 지정 

        appleBox.add(new Apple()); // 어떤 타입을 지정해야 하는지 바로 알 수 있음
        // appleBox.add(new Grape());
        grapeBox.add(new Grape());
        toyBox.add(new Toy());
        

        Jucier.makeJuice(fruitBox);
        Jucier.makeJuice(grapeBox);
        Jucier.makeJuice(appleBox);
        // Jucier.makeJuice(toyBox); // Fruit의 자식이 아니므로 할 수 없음

        
    }
}

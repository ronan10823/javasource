package inheritance;

public class AnimalEx {
    public static void main(String[] args) {
        // 인스턴스 생성 
        Animal animal = new Animal();

        Carnivore carnivore = new Carnivore();
        carnivore.eat(); // 고기를 ~~ 
        carnivore.print();

        Herbivore herbivore = new Herbivore();
        // 5-1) ClassCastException 강제형변환으로 난 오류
        // 5-3) 자식 = 부모(X) 안 된다.
        herbivore = (Herbivore) animal; // 5. 형변환을 할 수는 있다.
        herbivore.eat(); // 채소를 ~~ 

        // 5-2) 부모 = 자식
        // Animal animal = new Carnivore();
        // animal.eat();
        // ((Carnivore) animal).print(); // 
        // 5-4) 형변환으로 부를 수는 있다. 왜? 알아서 형변환이 되기 때문. 
        //      자식이 부모보다 크기 때문에 자동 형변환


        // animal = new Herbivore();
        // animal.eat();

        // Carnivore carnivore2 = new Carnivore();
        // herbivore = (Herbivore) carnivore2;
        // 형제/자매 관계는 형변환이 안 된다.


    }
}

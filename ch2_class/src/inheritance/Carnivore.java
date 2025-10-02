package inheritance;

// 육식동물
public class Carnivore extends Animal {

    String name;

    public Carnivore(){
        // super();가 숨어있어서, Animal 생성자가 먼저 출력된다.
        System.out.println("Carnivore 생성자");
    }
    @Override
    public void eat() {
        System.out.println("고기를 먹는다");
        // super.eat();
    }

    public void print(){
        System.out.println(name + "육식동물");
    }


}

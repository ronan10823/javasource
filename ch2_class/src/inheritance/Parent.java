package inheritance;

public class Parent {
    int age;

    public Parent() {
        super();
    }

    public Parent(int age) {
        this.age = age;
    }

    public void list() {
        System.out.println("부모 클래스");
    }

}

package inheritance;

public class ChidEx {
    public static void main(String[] args) {
        Parent parent = new Parent(45);
        Child child = new Child();
        Child2 child2 = new Child2();

        System.out.println(parent.age);
        System.out.println("child age + " + child.age);
        child.play(); //void이기에 sout으로 출력X
        child.list();
        
        System.out.println("child2 " + child2.age);
        child2.list();

    }
}

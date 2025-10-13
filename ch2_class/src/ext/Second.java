package ext;
 // 다른 패키지에 있는 클래스 사용할 때, 어디에서 쓰고 있는지 알려줘야 한다. 
import exam.Parent;


// public class Second{
//     Parent parent = new Parent();

//     public void print() {
//         parent.name = "성춘향"; // default (다른 패키지에서 접근 불가)
//         parent.grade = "A"; // protected (상속 관계가 있으면 다른 패키지라도 허용)
//     }
// }



public class Second extends Parent {
    Parent parent = new Parent();

    public void info(){
        // super.name = "성춘향"; // default > 상속 관계로 만들어도 호출 불가
        super.grade = "B"; // protected 
        parent.getNum1();
    }

    @Override
    public int getNum1() {
        return super.getNum1();
    }
}

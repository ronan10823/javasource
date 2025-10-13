package inheritance;

public class B implements I { // interface 상속받으면서 작성
    @Override // implements를 하면서 새로 추가
    public void methodB(){
        System.out.println("methodB()");
    }

    
}

package inheritance;

public class CreditLineAccount extends Account {

    private int minus;

    public CreditLineAccount(String accountNo, String owner, long balance, int minus) {
        super(accountNo, owner, balance);
        this.minus = minus;
    }
    
    public String credit(long balance, int minus){
        if () {
            
        }

    }
    // 마이너스 한도: 예금액이 10만원, + 마이너스 500만원까지 쓸 수 있다. => 51000000까지 빼서 쓸 수 있다. 
    // 멤버 변수 하나 선언, 초기화
    // 출금한다는 개념 > account의 withdraw + 마이너스 한도 포함 = override
}

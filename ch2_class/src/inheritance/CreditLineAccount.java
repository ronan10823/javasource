package inheritance;

public class CreditLineAccount extends Account {

    private int creditLine;

    public CreditLineAccount(String accountNo, String owner, long balance, int creditLine) {
        super(accountNo, owner, balance);
        this.creditLine = creditLine;
    }
    
    // 출금 = 잔액(잔액 + 마이너스 한도) - 사용액
@Override
long withdraw(long amount) throws Exception {
    if (super.getBalance() + creditLine < amount) {
        throw new Exception("마이너스 한도 확인");
    }

    // 출금 = 잔액(잔액 + 마이너스 한도) - 사용액 
    // 부모를 호출할 수 없음

    // 멤버 변수의 값을 변경 -> setter
    setBalance(getBalance() - amount);
    return super.withdraw(amount);
}
    // 마이너스 한도: 예금액이 10만원, + 마이너스 500만원까지 쓸 수 있다. => 51000000까지 빼서 쓸 수 있다. 
    // 멤버 변수 하나 선언, 초기화
    // 출금한다는 개념 > account의 withdraw + 마이너스 한도 포함 = override

    
}

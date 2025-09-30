package object;

public class Account {
    // 은행 계좌
    // 계좌번호(122-11-11111), 계좌주(홍길동), 잔액(10000, long)

    private String accountNo;
    private String owner;
    private long balance;
    
    // 기능: 입금한다(잔액 = 잔액 + 입금액), 출금한다(잔액 = 잔액 - 출금액)
    // 입금한다 => 입금액을 인자로 받아서 처리, 리턴 타입 없음, deposit > setter
    // 출금한다 => 출금액을 인자로 받아서 처리, 잔액 리턴, withdraw
    
    void deposit(long amount){
        balance += amount;
    }

    long withdraw(long amount){
        balance -= amount;
        return balance;
    }

    // 위의 두 개를 쓰라고 했을때 전혀 못 썼다. 

    // 일부러 전체선택만 만들었다.
    public Account(String accountNo, String owner, long balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }
    
    // 속성 값 조회 : get ~~ 
    public long getBalance() {
        return balance;
    }
    // 잔액 조회의 의미

    public String getOwner() {
        return owner;
    }
    // 계좌주만 조회
    public String getAccountNo() {
        return accountNo;
    }
}

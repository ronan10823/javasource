package inheritance;

import java.util.Scanner;

public class Account {
    // 은행 계좌
    // 계좌번호(122-11-11111), 계좌주(홍길동), 잔액(10000, long)

    private String accountNo;
    private String owner;
    private long balance;
    
    Scanner sc = new Scanner(System.in);
    
    // 기능: 입금한다(잔액 = 잔액 + 입금액), 출금한다(잔액 = 잔액 - 출금액)
    // 입금한다 => 입금액을 인자로 받아서 처리, 리턴 타입 없음, deposit > setter
    // 출금한다 => 출금액을 인자로 받아서 처리, 잔액 리턴, withdraw
    
    void deposit(long amount){
        balance += amount;
    }

    long withdraw(long amount) throws Exception{
        // 잔액 안에서 출금 허용
        if (amount > balance) {
            throw new Exception("잔액 부족");
        }
        balance -= amount;
        return balance;
    }



    public Account(String accountNo) {
        this.accountNo = accountNo;
    }
    
    public Account(String accountNo, String owner) {
        // this.accountNo = accountNo;
        this(accountNo);
        this.owner = owner;
    }

    public Account(String accountNo, String owner, long balance) {
        // this.accountNo = accountNo;
        // this.owner = owner;
        this(accountNo, owner);
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

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

    
    
}

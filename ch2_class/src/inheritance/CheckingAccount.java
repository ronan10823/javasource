package inheritance;

import java.io.EOFException;

public class CheckingAccount extends Account {

    private String cardNo; // 직불카드 번호

    public CheckingAccount(String accountNo, String owner, long balance, String cardNo) {
        super(accountNo, owner, balance);
        this.cardNo = cardNo; // cardNo를 받은 거로 하겠음
    }
    
    // 직불 카드 사용액을 지불한다. 
    long pay(String cardNo, long amount) throws Exception{
        // 카드 번호 일치
        // if (this.cardNo.equals(cardNo)) { 일치한다면
        if (!this.cardNo.equals(cardNo)) {
            throw new Exception("카드 번호 확인");
        }
        // 일치하면 출금
        // 잔액 = 잔액 - 직불카드 사용액
        return withdraw(amount);
    }
}

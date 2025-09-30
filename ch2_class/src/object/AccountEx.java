package object;

public class AccountEx {
    public static void main(String[] args) {
        // Account 인스턴스 생성
        Account account = new Account("112-111-1111", "홍길동", 500000);


        // 입금한다 호출 
        account.deposit(50000);
        // 입금 후의 잔액이 궁금하면? account.balance로 불러올 수 있다.
        // 이것도 전혀 몰랐다. 위와 아래 둘 다.
        // System.out.println("잔액 : " + account.balance); private에서는 호출 못함
        System.out.println("잔액 : " + account.getBalance()); 

        // 출금한다 호출

        long balance = account.withdraw(70000);
        System.out.println("잔액 : " + balance);


        Account account2 = new Account("122-222-2222", "성춘향", 150000);

        // System.out.println("잔액 : " + account2.getBalance());
        System.out.println("================================");
        System.out.println("1. 계좌번호 : " + account2.getAccountNo());
        System.out.println("2. 계좌주 : " + account2.getOwner());
        System.out.println("3. 잔액 : " + account2.getBalance());
        System.out.println("================================");

    }
}

package lang;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("111", "홍길동", 10000);

        

        try {
            account.withdraw(20000);
            
        } catch (BalanceInsufficientException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
        // 호출하는 곳에서 해결해야 한다. 
        // Runtime Exception을 상속받아서 컴파일러에서 잡아낼 수 없다. 
    }
}

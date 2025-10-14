package ext;

public class AccountEx {
    public static void main(String[] args) {
        // Account 계좌 3개 생성
        Account account1 = new Account("111", "홍길동", 10000);
        Account account2 = new Account("222", "성춘향", 10000);
        Account account3 = new Account("333", "이순신", 10000);

        // 배열을 이용해서, 같은 데이터를 여러 개 생성 가능
        // 배열 생성
        int[] arr = new int[3];
        //초기화
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 6;
        // 배열 생성 + 초기화
        int[] arr2 = {4, 5, 6};

        // Account 배열
        Account[] accounts = new Account[3];
        // 초기화 : 객체라서 new로 선언해야 한다. 
        accounts[0] = new Account(null, null, 0);
        accounts[1] = new Account(null, null, 0);
        accounts[2] = new Account(null, null, 0);
        // Account 배열 생성 + 초기화
        Account[] accounts2 = { new Account(null, null, 0), 
                new Account(null, null, 0), 
                new Account(null, null, 0) };

    }
}

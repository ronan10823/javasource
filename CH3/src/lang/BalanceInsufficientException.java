package lang;

// Exception : (상속하면) 컴파일 예외 발생 (의 의미)
// RuntimeException : 실행 시 예외 발생
// 둘 중 하나 상속

// 1) Exception 상속 
// public class BalanceInsufficientException extends Exception {
//     public BalanceInsufficientException() {
//     }

//     public BalanceInsufficientException(String message) {
//         super(message);
//     }
// }



// 2) Runtime Exception을 상속
public class BalanceInsufficientException extends RuntimeException {
    public BalanceInsufficientException() {
    }

    public BalanceInsufficientException(String message) {
        super(message);
    }
}

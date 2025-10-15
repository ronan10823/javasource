package lang;

public class ExceptionEx1 {
    public static void main(String[] args) {
        System.out.println(4 / 0);
        // Throwable
        //  Exception
        //  Error
        
        try {
            // 예외가 발생할 수 있는 코드 작성
            Class.forName("null");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // 개발자 확인용(예외 발생이 어디서 났는지 추적)
        }
    }
}

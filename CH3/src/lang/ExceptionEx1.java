package lang;

public class ExceptionEx1 {
    public static void main(String[] args) {
        // System.out.println(4 / 0);

        // 예외가 발생할 수 있는 코드 작성
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void findClass() throws ClassNotFoundException {
        Class.forName("null");
    }
}

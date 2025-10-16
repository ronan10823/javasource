package lang;

public class ExceptionEx5 {
    public static void main(String[] args) {

        // 7. 멀티 캐치
        try {
            String data1 = "a100";
            String data2 = args[0];
            int value = Integer.parseInt(data1);
            System.out.println(value);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("입력값 혹은 인자값을 확인해주세요");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

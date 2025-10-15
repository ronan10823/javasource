package lang;

public class StringEx4 {
    public static void main(String[] args) {
        String[] names = {"Qeen", "Tod", "Kim", "Park", "Hong"};

        StringEx4 obj = new StringEx4();
        String result = obj.findKim(names);
        System.out.println(result);
        // 결과를 받아서 출력
    }

    public String findKim(String[] names) {
        int pos = 0;
        // return 값 : Kim 은 ? 번째에 있다
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Kim")) {
                // i값 보관
                // 중지
                pos = i;
                break;
            }
        }
        return "Kim 은 " + (pos+1) + "번째에 있다";
    }
}

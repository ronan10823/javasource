package lang;

public class StringEx5 {
    public static void main(String[] args) {
            System.out.println(count("12345AB45AB345AB", "AB"));
            System.out.println(count("123445BC", "BC"));
    }

    public static int count(String src, String target) {
        // target이 src 내에 몇 번 나오는가?
        // indexOf()
        int count = 0;
        int pos = 0;

        while ((pos = src.indexOf(target, pos)) != -1) {
            pos = pos + target.length();
            count++;
        }

        return count;
    }
}

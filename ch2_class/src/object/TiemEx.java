package object;

public class TiemEx {
    public static void main(String[] args) {
        Time time = new Time();

        // 시, 분, 초 지정(필드의 값을 변경/초기화 > setter 밖에 없다. )
        time.setHour(25);
        time.setMinute(58);
        time.setSecond(59);

        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }
}

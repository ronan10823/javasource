package object;

public class Time {
    private int hour;
    private int minute;
    private int second;


    // 시, 분, 초는 모두 0보다 크거나 같아야 한다. 
    // 시의 범위는 0 ~ 23, 분, 초의 범위는 0 ~ 59
    // 위와 같은 조건이 있다면, if 문을 사용해야 한다. 

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            return;
        }
        this.second = second;
    }    
        
    
}

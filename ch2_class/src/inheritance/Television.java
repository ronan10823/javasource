package inheritance;

public class Television implements RemoteControl { // 일반 클래스다.
    private int volume; // 일반적으로 가장 처음에 멤버 변수를 작성하기에 원래 세번째 Override 위에 작성했지만 위로 가져옴

    @Override
    public void turnOn() {
        System.out.println("Television 을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Television 을 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Television 볼륨 : " + this.volume);
    }
    
}

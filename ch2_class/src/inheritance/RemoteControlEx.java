package inheritance;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn(); // TV 켜기
        rc.setVolume(5);
        rc.setMute(true);
        rc.setVolume(15);
        rc.turnOff();


        rc = new Audio();
        rc.turnOn();
        rc.setVolume(7);
        // rc.changeBattery;
        RemoteControl.changeBattery(); // static은 이름으로 호출해야 한다.
        rc.setVolume(9);

        // 익명 클래스 (1회용)
        // 많이 사용하는 건 Class로 정의, 그러나 이건 한두번만 사용하고 끝날 것.
        // 인스턴스 생성)
        rc = new RemoteControl() {
            private int volume;

            @Override
            public void turnOn() {
                System.out.println("Radio 를 켭니다");
            }
            
            @Override
            public void turnOff() {
                System.out.println("Radio 를 끕니다");
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
                System.out.println("현재 Radio 볼륨 : " + this.volume);
            }
            
        };

        rc.turnOn();
        rc.setVolume(8);
        rc.setMute(false);
        rc.turnOff();
    }
}

package inheritance;

public interface RemoteControl {
    
    // 상수 선언 -> 보통 두 개의 단어가 붙으면 언더바(_)로 구분
    static final int MAX_VOLUME = 10; //변하지 않는 숫자 -> static을 주로 작성하기에, static까지 붙여서 작성하는게 일반적인 형태다. 
    static final int MIN_VOLUME = 0; //변하지 않는 숫자 -> static을 주로 작성하기에, static까지 붙여서 작성하는게 일반적인 형태다. 
    
    // 추상 메서드
    abstract void turnOn();

    abstract void turnOff();
    
    abstract void setVolume(int Volume);

    // 일반 메서드 
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리");
        } else {
            System.out.println("무음 해체");
        }
    }
    

    static void changeBattery() {
        System.out.println("건전지 교환");
    }
}

    // 2. 이 리모콘은 만능 리모콘이라, TV나 라디오 등의 전자기기의 전원을 키고 끄거나, 볼륨을 조절할 수 있다고 가정해보자. 
    // TV와 라디오, 오디오 등의 공통적인 기능(켜기, 끄기, 볼륨 조절)을 구현하려고 하는데, 동일한 기능이기에 차라리 부모를 만드는 것이 낫다고 판단하고, 부모 클래스 정의를 설계
    // 부모 클래스를 일반/추상/인터페이스 중 어떤 것으로 정의할 것인지 고민해봐야 한다. 
    // 이 경우, 기능 구현 시 상수만 있으면 될 것 같다고 판단함 -> 굳이 추상 클래스를 할 필요가 없다. (왜? interface로 하면 상수로만 깔끔하게 만들 수 있으니까.)
    // 두 번째, 공통적인 기능을 하는 메서드(켜기, 끄기, 볼륨 조절)이 필요하지만, 각 TV나 오디오마다 출력하는 문구는 다르게 하고 싶다. (Audio를 켠다, Audio를 끈다, TV를 켠다, TV를 끈다)
    //  행동(기능)은 동일하지만, 자식 클래스에서 하는 내용이 다른 경우, 일반 클래스가 아닌 추상 클래스로 내려온다. 
    // 원래 interface는 상수와 추상 메서드까지만 있었으나, 기능적으로 더욱 발전하면서 interface에 일반 메서드를 default와 static으로 작성할 수 있게 되었다. 

    // 
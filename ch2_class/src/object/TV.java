package object;

public class TV {
    // 속성 : 크기(52), 채널(7), 파워(true/flase), 색상(black) *중요!*
    int size;
    int channel;
    boolean power;
    String color;
    // 생성자: 클래스 이름과 동일 + 괄호 가지고 있음
    public TV() { 
    }
    @Override
    public String toString() {
        return "TV [size=" + size + ", channel=" + channel + ", power=" + power + ", color=" + color + "]";
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public void setPower(boolean power) {
        this.power = power;
    } // void 메소드 (변수), 오른쪽에 있는 변수를 왼쪽에 넣어줘.
    public void setColor(String color) {
        this.color = color;

        
        
        
    }
    
    // 기능 : 채널 변경, 전원 여부, 볼륨 조절, 
    
    public void channelUp(){
        ++this.channel;
    }

    public void channelDown(){
        --this.channel;
    }


    // getter 
    // 기본적으로 멤버변수, 생성자, 게터, 세터 이렇게 생성한다. 
    public int getSize() {
        return size;
    }
    public int getChannel() {
        return channel;
    }
    public boolean isPower() { // boolean이기에 get이 아닌 is의 형태로 만들어진다.
        return power;
    }
    public String getColor() {
        return color;
    }

    

    
}

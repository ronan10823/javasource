package object;

public class TVEx {
    public static void main(String[] args) {
        // TV class의 인스턴스를 생성
        TV tv = new TV(); // TV라는 변수는 이 페이지에서 TV라고 만들자
        // System.out.println(tv); // 그냥 실행하면 object.TV@5ca881b5
        // new를 해서 나오는 애들 특징이 이런 주소가 뜰 수 있다.
        // - 정수형 : 0, 실수형 : 0.0, 논리형: flase, 문자형: 빈 문자열 하나
        // - String : null
        
        // tv.power = true;
        // 메서드 호출(전원 on/off) : 멤버 변수의 값을 
        tv.setPower(true);
        tv.setSize(48);
        

        // tv.size = 48;
        // tv.channel = 3;
        tv.setChannel(3);
        // tv.color = "black";
        tv.setColor("black");
        
        System.out.println(tv);

        // 두 번째 TV

        TV tv2 = new TV(); // tv2 만들기
        tv2.setPower(true);
        tv2.setChannel(7);
        tv2.setColor("white");
        tv2.setSize(40);
        
        // 채널 +
        tv2.channelUp();
                
        System.out.println(tv2);

    }
}

package object;

public class SubscriberInfoEx {
    public static void main(String[] args) {
        SubscriberInfo info = new SubscriberInfo();

        // 속성 변경(초기화)
        // 1. 직접 접근 : private 사용하면 불가
        // 2. 생성자 -- 이번에는 생성 생략
        // 3. 메소드 : set~~ (단순 return이 아님)
        info.setId("gong112");
        info.setName("홍길동");
        info.changePassword("aeefeilsi1876");
        info.changePhone("010-4222-1111");

        // 가입자 정보 조회
        // 1. 간단 조회 : toString()
        // System.out.println(info.toString());
        System.out.println(info); // toString()이 자동으로 호출됨
        // 2. 개별 조회 : get~~~()
        System.out.println("아이디 : " + info.getId());

    }
}

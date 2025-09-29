package object;

public class Student {
    // 멤버 변수, 멤버 메소드, 생성자 > 일반적인 요소 O,  필수적인 요소 X
    // 학생의 이름(홍길동), 전화번호(010-1234-5678), 주소(서울시 종로구 25)

    String name; 
    String tel;
    String address;


    // 생성자
    public Student() {
    }

    // 메소드
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;

    
    
    }


    // 메소드 만들기

    // 이름 변경하는 메소드 만들기
    // 1. 리턴 타입을 무엇으로 하지? 고민해야 한다. 
    // 2. 메소드명은 무엇으로 하지?
    // 리턴타입 메소드명(매개변수1, 매개변수2, .....) {}
    // void + 기본타입-int, float, double, ... , 참조타입 - String, [] ...

    // void changeName(String name){
    //     this.name = name;
    // }
    // 받은 걸 여기에 대입해줘 < 로 가야 한다. "테스트" X, name O ..왜?
    
    String changeName(String name){
        this.name = name;
        
        return this.name;
    }
    // void > String으로 바꿔서 그에 맞는 

    @Override
    public String toString() {
        return "Student [name=" + name + ", tel=" + tel + ", address=" + address + "]";
    }



}

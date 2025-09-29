package object;

public class StudentEx {
    public static void main(String[] args) {
        // 객체 생성 
        Student obj = new Student();

        // 인스턴스 초기화
        obj.name = "홍길동";
        obj.tel = "010-1234-5678";
        obj.address = "서울시 종로구 15";

        // 메서드 호출
         
        // System.out.println(obj.getAddress());

        Student student = new Student();
        // 멤버 변수 값 변경(set)
        student.setName("성춘향");
        student.setTel("010-5678-5987");
        student.setAddress("경기도 수원시");
        
        // System.out.println(student);
        
        
        // 멤버 변수 값 가져오기(get)
        // System.out.println(student.getName());
        // get 메서드이기에 변수만 담거나 print 구문에 담기



        //// 처음에 만들었던 홍길동 이름 변경하고 싶다.
        // 이름 변경 메소드부터 호출

        // obj.changeName(); // 호출만 하기
        // System.out.println(obj);

        // 성춘향이 이름을 성천사라고 바꿨다고 알려줘야 한다. 
        student.changeName("성천사");
        // setName과 동일하게 생겼다. 

        System.out.println(student);

    }
}

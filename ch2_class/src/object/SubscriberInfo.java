package object;

public class SubscriberInfo {
    // 가입자 정보
    // 이름, 아이디(영어, 숫자), 비밀번호(영어, 숫자, 특수문자), 전화번호(010-0000-0000)
    // name, id, password, phone
    private String name;
    private String id;
    private String password;
    private String phone;

    
    // 기능 : 비밀번호 변경, 전화번호 변경
    // changPassword(변경할 비밀번호)
    // changPhone(변경할 전화번호)
    void changePassword(String password){
        this.password = password;
    }
    void changePhone(String phone){
        this.phone = phone;
    }

    //setter 메소드
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }


    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }




    @Override
    public String toString() {
        return "SubscriberInfo [name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phone + "]";
    }

    
    
    // public void setPassword(String password) {
    //     this.password = password;
    // }
    // public void setPhone(String phone) {
    //     this.phone = phone;
    // }
    // 이 둘은 위의 만들어둔 기능과 동일하므로, 삭제

    // return하라는 말은 안 했다. viod 사용
    // String changePassword(String password){
    //     this.password = password;
    //     return this.password;
    // }

    // String changePhone(String phone){
    //     this.phone = phone;
    //     return this.phone;
    // }






}

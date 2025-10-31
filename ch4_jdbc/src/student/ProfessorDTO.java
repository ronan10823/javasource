package student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 클래스의 뒤에 붙인다. --DTO(Data Transfer Object)
// 유사한 개념으로 --VO(Value Object)가 있다. 
// 1차적으로 professor 테이블(db)의 모양과 동일하게 만들면 된다. 

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ProfessorDTO {
    private String profId;
    private String proName;
    private String deptId;

    // DTO, VO는 생성자,
    // getter, setter, toString를 기본적으로 만든다. 
    // 직접 아래와 같이 만드는 방법도 있고, 위와 같이 롬복으로 만드는 방법도 있다.

    // 생성자    
    // public ProfessorDTO() {
    // }

    // public ProfessorDTO(String profId, String proName, String deptId) {
    //     this.profId = profId;
    //     this.proName = proName;
    //     this.deptId = deptId;
    // }


    // // getter, setter, toString
    // public String getProfId() {
    //     return profId;
    // }

    // public void setProfId(String profId) {
    //     this.profId = profId;
    // }

    // public String getProName() {
    //     return proName;
    // }

    // public void setProName(String proName) {
    //     this.proName = proName;
    // }

    // public String getDeptId() {
    //     return deptId;
    // }

    // public void setDeptId(String deptId) {
    //     this.deptId = deptId;
    // }

    // @Override
    // public String toString() {
    //     return "ProfessorDTO [profId=" + profId + ", proName=" + proName + ", deptId=" + deptId + "]";
    // }


    
    
}

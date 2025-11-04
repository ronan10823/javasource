package student2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    // make same as db table
    // getter, setter, etc
    private String studentId;
    private String name;
    private Double height;
    private String deptId;

}

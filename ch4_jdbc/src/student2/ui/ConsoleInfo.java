package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;

public class ConsoleInfo {
    // ui 담당
    
    // take info of new student 
    public StudentDTO insertStudent(Scanner sc){
        System.out.println("학번 > ");
        String studentId = sc.nextLine();
        System.out.println("이름 >> ");
        String name = sc.nextLine();
        System.out.println("학과코드 >> ");
        String deptId = sc.nextLine();
        System.out.println("키 >> ");
        Double height = Double.parseDouble(sc.nextLine());

        return new StudentDTO(studentId, name, height, deptId);
    }

    public StudentDTO updateStudent(Scanner sc){
        System.out.println("===== 수정할 학생 정보 =====");
        System.out.println("학번 : ");
        String studentId = sc.nextLine();
        System.out.println("키 :" );
        Double height = sc.nextDouble();
        
        StudentDTO sDto = new StudentDTO();
        sDto.setStudentId(studentId);
        sDto.setHeight(height);
        return sDto;
        
        // there is 2 way of making this
        // 1. 생성자 만들기 (studentId, height 2개만 인자를 가진 생성자)
        // 2. 위와 같이 아예 불러오기
    }

    public String deleteStudent(Scanner sc){
        System.out.print("학번 : ");
        String studentId = sc.nextLine();
        return studentId;
    }

    public String getDeptStudent(Scanner sc){
        System.out.print("학과코드 : ");
        String deptId = sc.nextLine();
        return deptId;    
    }

    public String getStudentId(Scanner sc){
        System.out.print("학번 : ");
        String studentId = sc.nextLine();
        return studentId;    
    }

    // many 

    public void printStudent(StudentDTO dto){
        System.out.printf("%s\t%s\t%f\t%s\n", 
                dto.getStudentId(), dto.getName(),dto.getHeight(),dto.getDeptId());
    }

    public void printAllStudent(List<StudentDTO> list){
        for (StudentDTO dto : list) {
            System.out.printf("%s\t%s\t%f\t%s\n", 
                dto.getStudentId(), dto.getName(),dto.getHeight(),dto.getDeptId());
        }
    }



    // the methods of Professor insert/delete/update/select

    public ProfessorDTO insertProfessor(Scanner sc) {

        System.out.print("아이디 >> ");
        String profId = sc.nextLine();
        System.out.print("이름 >> ");
        String name = sc.nextLine();
        System.out.print("학과코드 >> ");
        String deptId = sc.nextLine();

        return new ProfessorDTO(profId, name, deptId);
    }

    public ProfessorDTO updateProfessor(Scanner sc) {
        System.out.println("===== 수정할 교수 정보 =====");
        System.out.print("교수번호 >> ");
        String profId = sc.nextLine();
        System.out.print("변경할 학과 코드 >> ");
        String deptId = sc.nextLine();
        // 2개 넘길 때에는 DTO를 써라 
        
        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setProfId(profId);
        professorDTO.setDeptId(deptId);
        return professorDTO;
    }

    public String deleteProfessor(Scanner sc) {
        // 삭제할 교수 아이디 받기
        System.out.println("===== 삭제할 교수 정보 =====");
        System.out.print("교수번호 >> ");
        String profId = sc.nextLine();
        return profId;
    }

    public String selectProfessor(Scanner sc) {
        // 특정교수 조회
        System.out.println("===== 교수 조회 =====");
        System.out.print("교수번호 >> ");
        String profId = sc.nextLine();
        return profId;
    }


    public void printProfessor(ProfessorDTO dto){
        System.out.println("교수번호 : " + dto.getProfId());
        System.out.println("교수명 : " + dto.getProfName());
        System.out.println("학과번호 : " + dto.getDeptId());
    }


        // about department 


    public String getDeptId(Scanner sc){
        System.out.println("\n------- 학과 정보 입력 ------");
        System.out.print("학과번호 >> ");
        String deptId = sc.nextLine();
        
        return deptId;
    }



    public DeptDTO setDept(Scanner sc){
        System.out.println("\n------- 학과 정보 입력 ------");

        System.out.print("학과코드 >> ");
        String deptId = sc.nextLine();
        System.out.print("학과명 >> ");
        String deptName = sc.nextLine();
        return new DeptDTO(deptId, deptName);
    }



    public String getDeptName(Scanner sc){
        System.out.print("학과명 >> ");
        String deptName = sc.nextLine();
        return deptName;
    }

    public void print(DeptDTO deptDTO){
        System.out.println("\n------- 학과 정보 ------");
        System.out.println("학과번호\t학과명");
        System.out.println("------------------------------");
        System.out.print(deptDTO.getDeptId()+"\t");
        System.out.println(deptDTO.getDeptName());                                                                       
    }  

    public void printAll(List<DeptDTO> list){
        System.out.println("\n------- 전체 학과 정보 ------");
        System.out.println("학과번호\t학과명");
        System.out.println("------------------------------");
        for (DeptDTO deptDTO : list) {
            System.out.print(deptDTO.getDeptId()+"\t");
            System.out.println(deptDTO.getDeptName());
        }                                                                       
    }                       

} 
package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;
import student2.service.DeptService;
import student2.service.ProfessorService;
import student2.service.StudentService;

public class DeptMain {
    public static void main(String[] args) {

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        DeptService deptService = new DeptService();
        ProfessorService professorService = new ProfessorService();
        ConsoleInfo info = new ConsoleInfo();
        StudentService studentService = new StudentService();

        while (run) {
            System.out.println("==================================");
            System.out.print("1. 학과등록 | ");
            System.out.print("2. 학과수정 | ");
            System.out.print("3. 학과삭제 | ");
            System.out.print("4. 학과조회 | ");
            System.out.print("5. 전체학과조회 | ");
            System.out.println();
            System.out.print("6. 교수정보 입력 | ");
            System.out.print("7. 교수정보 수정 | ");
            System.out.print("8. 교수정보 삭제 | ");
            System.out.print("9. 교수정보 조회 | ");
            System.out.println();
            System.out.print("10. 학생정보 입력 | ");
            System.out.print("11. 학생정보 수정 | ");
            System.out.print("12. 학생정보 삭제 | ");
            System.out.print("13. 학생정보 조회(학과별) | ");
            System.out.print("14. 학생정보 조회(개인별) | ");
            System.out.println("15. 프로그램 종료");
            System.out.println("==================================");
            System.out.print("선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // 추가할 학과번호,학과명 입력받기
                    DeptDTO dto = info.setDept(sc);
                    boolean result = deptService.addDept(dto);
                    // service 작업
                    System.out.println(result ? "학과정보 추가 성공" : "학과정보 추가 실패");
                    break;
                case 2:
                    // 수정할 학과정보 입력받기
                    dto = info.setDept(sc);
                    // service 작업
                    result = deptService.updateDept(dto);
                    System.out.println(result ? "학과정보 수정 성공" : "학과정보 수정 실패");
                    break;
                case 3:
                    // 삭제할 학과번호 입력받기
                    String deptId = info.getDeptId(sc);
                    // db작업
                    result = deptService.removeDept(deptId);
                    System.out.println(result ? "학과정보 삭제 성공" : "학과정보 삭제 실패");
                    break;
                case 4:
                    String deptName = info.getDeptName(sc);
                    dto = deptService.getDept(deptName);
                    info.print(dto);
                    break;
                case 5:
                    List<DeptDTO> list = deptService.getDepts();
                    info.printAll(list);
                    break;
                case 6:
                    // input the info of professor
                    // we have to put 3 variables in here.
                    // we worked something in ConsoleInfo

                    // take Prof info for insert
                    ProfessorDTO professorDTO = info.insertProfessor(sc);
                    // take result after give a input info.
                    result = professorService.insertProfessor(professorDTO);
                    System.out.println(result ? "Successed inserting Prof Info" : "Faild of Inserting Prof Info");
                    break;
                case 7:
                    // take Prof info for update 
                    professorDTO = info.updateProfessor(sc);
                    // take result after give Prof_Info(Update) to Service
                    result = professorService.updateProfessor(professorDTO);
                    System.out.println(result ? "Updating Prof_Info Success" : "Updating Prof_Info Failed");
                    break;
                case 8:
                    // take Prof info for delete
                    String profId = info.deleteProfessor(sc);
                    // take result after give Prof_Info(Delete) to Service
                    result = professorService.deleteProfessor(profId);
                    System.out.println(result? "Delete Prof_info Success": "Delete Prof_info Failed");
                    break;
                case 9:
                    // take Prof info for check
                    profId = info.selectProfessor(sc);
                    // take result after give Prof_Info() to Service
                    professorDTO = professorService.getProfessor(profId);
                    // printout the result > you add some method in ConsloeInfo.
                    info.printProfessor(professorDTO);
                    break;
                case 10: // 학생 입력
                    StudentDTO sDto = info.insertStudent(sc);
                    result = studentService.insertStudent(sDto);
                    System.out.println(result ? "Student Info Insert Success":"Student Info Insert Fail");
                    break;
                case 11: // 수정
                    sDto = info.updateStudent(sc);
                    result = studentService.updateStudent(sDto);
                    System.out.println(result ? "Student_Info Update Success" : "Student_Info Update Fail");
                    break;
                case 12: // 삭제
                    String student = info.deleteProfessor(sc);
                    result = studentService.deleteStudent(student);
                    System.out.println(result ? "Student_Info Delete Success":"Student_Info Delete Fail");
                    break;
                case 13: // 학과별 조회
                    deptId = info.getDeptId(sc);
                    List<StudentDTO> sList = studentService.getStudents(deptId);
                    info.printAllStudent(sList);
                    break;
                case 14: /// 개인별 조회
                    String studentId = info.getStudentId(sc);
                    sDto = studentService.getStudent(studentId);
                    info.printStudent(sDto);
                    break;
                case 15:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
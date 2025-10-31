package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Select2 {
    public static void   main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "javadb";
            String password = "12345";
            
            con = DriverManager.getConnection(url, user, password);

            // 조회할 학생아이디 입력받기
            System.out.println("아이디 입력 >> ");
            String studentID = sc.nextLine();

            // 보안상의 이유로 값을 ?로 표시한다. 
            String sql = "select * from student where student_id=?";
            pstmt = con.prepareStatement(sql);
            // 서버에 보내면 DB 서버에서는 다양한 값들이 ?에 들어올수 있다고 인식

            // execute하기 직전에 ?에 뭐가 들어올지 알려줘야 한다. 
            pstmt.setString(1, studentID);
            rs = pstmt.executeQuery();
            // 그러고는 실행한다. 
            //그러고 나서 while을 실행하면, 있으면 나오고 없으면 실행안함. 
            // 사용자와 더욱 상호작용하는 프로그램을 만든 것이다. 
            while (rs.next()) {
                String id = rs.getString("student_id");
                String name = rs.getString("name");
                int height = rs.getInt("height");
                String deptId = rs.getString("dept_id");
                System.out.printf("%s\t%s\t%d\t%s\n", id, name, height, deptId);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

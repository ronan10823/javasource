package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
    public static void main(String[] args) {
        
        try {
            // 1. 드라이버 로드(대소문자 구별, 정해져있으므로 정확하게 입력해야)
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            // 2. DB 연결
            Connection con = DriverManager.getConnection(url, user, password);

            // 3. sql 구문 
            String sql = "INSERT INTO EXAM_EMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) ";
            sql+="VALUES(8888, 'EIGHT', 'ANALYST',6300,'1995-08-18',4500,7722,80)";
            

            PreparedStatement pstmt = con.prepareStatement(sql);
            int result = pstmt.executeUpdate();
            System.out.println(result > 0 ? "입력 성공" : "입력 실패");

        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}

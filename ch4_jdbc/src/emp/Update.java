package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
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
            String sql = "update emp set sal = 1500 where empno = 7499";

            PreparedStatement pstmt = con.prepareStatement(sql);
            int result = pstmt.executeUpdate();
            System.out.println(result > 0 ? "업데이트 성공" : "업데이트 실패");

        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}

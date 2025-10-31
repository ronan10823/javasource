package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select2 {
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
            String sql = "select * from emp where empno = 7499";

            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();    
            
            while (rs.next()) {
                System.out.print(rs.getInt("empno")+"\t");
                System.out.print(rs.getString("ename")+"\t");
                System.out.print(rs.getString("job")+"\t");
                System.out.print(rs.getInt("mgr")+"\t");
                System.out.print(rs.getDate("hiredate")+"\t");
                System.out.print(rs.getInt("sal")+"\t");
                System.out.print(rs.getInt("comm")+"\t");
                System.out.println(rs.getInt("deptno"));
            }

        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}

package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select3 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            // 1. 드라이버 로드(대소문자 구별, 정해져있으므로 정확하게 입력해야)
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            // 2. DB 연결
            DriverManager.getConnection(url, user, password);

            // 3. sql 구문 
            String sql = "select * from emp";

            con.prepareStatement(sql);
             pstmt.executeQuery();    
            
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
            
        } finally {
        try {
            rs.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        }

    }
}

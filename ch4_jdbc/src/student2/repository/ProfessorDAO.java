package student2.repository;

import static student2.repository.JDBCUtill.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import student2.dto.ProfessorDTO;

public class ProfessorDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

   
    public ProfessorDAO(Connection con) {
        this.con = con;
    }



    public int insert(){
        int result = 0;
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }



    public int update(){
        int result = 0;
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }



    public int delete(){
        int result = 0;
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }



    public ProfessorDTO getRow(){
        ProfessorDTO dto = null;
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            close(rs);
            close(pstmt);
        }
        return dto;
    }




}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import static Helper.JDBC.PrepareStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author long
 */
public class JDBC {

    public static String dtbUrl = "jdbc:sqlserver://localhost:1433;database=Hotell";
    public static String user = "sa";
    public static String pass = "songlong";
    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(dtbUrl, user, pass);
        
    }
    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());

        }

    }

    public static PreparedStatement PrepareStatement(String sql, Object... soluong) throws SQLException {
        Connection con = DriverManager.getConnection(dtbUrl, user, pass);
        PreparedStatement pstm = con.prepareStatement(sql);
        for (int i = 0; i < soluong.length; i++) {
            pstm.setObject(i + 1, soluong[i]);

        }
        return pstm;

    }

    public static void excuteUpdate(String sql, Object... model) {

        try {
            PreparedStatement pstm = PrepareStatement(sql, model);
            try {
                pstm.executeUpdate();
            } finally {
                pstm.getConnection().close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ResultSet excuteQuery(String sql, Object... Model) {
        ResultSet rs = null;
        try {
            PreparedStatement pstm = PrepareStatement(sql, Model);
            rs = pstm.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;

    }

   

}

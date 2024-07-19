/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kiêt
 */
public class MahaFunction {
    public SYSConnection sysCon = new SYSConnection();
    public Connection con = sysCon.getConnection();
    
    public ResultSet ExeCuteQuery(String sql)
    {
        ResultSet rs = null;
        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MahaFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}

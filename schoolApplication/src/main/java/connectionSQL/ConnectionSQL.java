/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionSQL;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author EzzeG
 */ 
public class ConnectionSQL {
    
    Connection connect = null;
    
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.driver");
            connect = DriverManager.getConnection("jdbcmysql://localhost/school", "root","");
            
            JOptionPane.showMessageDialog(null, "Conected Succesfully");
        }
        catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Conection Failed" + e.getMessage());

        }
        return connect;
    }
    
}   

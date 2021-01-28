/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionSQL;
import java.sql.Connection;
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
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/school", "root","");
            
            JOptionPane.showMessageDialog(null, "Conected Succesfully");
        }
        catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Conection Failed " + e.getMessage());

        }
        return connect;
    }
    
}   

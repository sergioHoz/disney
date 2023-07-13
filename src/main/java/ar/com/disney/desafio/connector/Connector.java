
package ar.com.disney.desafio.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    
    private Connector() {}
 
    public static Connection conectar(){
        
        Connection con = null;
        
        try {
            
            con =   DriverManager.getConnection("jdbc:mariadb://localhost:3306/disney","root","");
           
            System.out.println("se conecto a la base de datos");
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        return con;
    }
}

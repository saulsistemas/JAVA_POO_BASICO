
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author HELPNET
 */
public class TestMysqlJDBC {
    public static void main(String[] args) {
        //1 - Indicar atributos para conexion
        String url ="jdbc:mysql://localhost:3306/restaurante";
        String user ="root";
        String password="";
        
        //2 - Cargar Driver
        //Class.forName("com.mysql.cj.jdbc.Driver");
        
        try {
            //2 - Cargar Driver
            Connection conexion = DriverManager.getConnection(url,user,password);
            
            Statement statement = conexion.createStatement();//Habilitando proceso para ejecutar sentencia SQL
            String sql = "SELECT * FROM restaurante.tipo_restaurante;";
          
            if (conexion!=null) {
                System.out.println("La conexion fue exitosa");
            }else{
                System.out.println("La conexio no fue exitosa"+conexion);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error "+ex);
        }
        
        
    }

        
        
}

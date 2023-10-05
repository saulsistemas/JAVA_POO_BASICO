
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
            
            Statement instruccion = conexion.createStatement();//Habilitando proceso para ejecutar sentencia SQL
            String sql = "SELECT * FROM restaurante.tipo_restaurante;";
            ResultSet resultado = instruccion.executeQuery(sql);
            
            while (resultado.next()) {
                System.out.println("Id - " + resultado.getInt("idTipoRestaurante")+" ---- Descripcion - " + resultado.getString("descripcion"));    
                System.out.println();  
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error "+ex);
        }
        
        
    }

        
        
}

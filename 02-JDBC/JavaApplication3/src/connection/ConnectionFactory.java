package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author HELPNET
 */
public class ConnectionFactory {
    //objeto Connection(Tipo) Variable
    //Variable de tipo Connection
    private static Connection connection;
    
    public static Connection conectar() throws ClassNotFoundException, SQLException{
        //1 - Cargar Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //2 - Establecer los datos de Conexxion
        String url ="jdbc:mysql://localhost:3306/restaurante";
        String user ="root";
        String password="";
        
        //3 - Establecer la conexion por metodo
        connection = DriverManager.getConnection(url,user,password);
        
        return connection;
        
    }
}

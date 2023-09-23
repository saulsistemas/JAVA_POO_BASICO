package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author HELPNET
 */
public class ConnectionFactory {
    //objeto Connection(Tipo) Variable
    //Variable de tipo Connection
    private static Connection connection;
    
    //objeto encargado de habilitar y ejecutar las sentencias SQL
    private static Statement statement;
    
    public static Connection conectar() throws ClassNotFoundException, SQLException{
        //1 - Cargar Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //2 - Establecer los datos de Conexxion
        String url ="jdbc:mysql://localhost:3306/restaurante";
        String user ="root";
        String password="";
        
        //3 - Establecer la conexion por metodo
        connection = DriverManager.getConnection(url,user,password);
        
        statement = connection.createStatement();//Habilitando proceso para ejecutar sentencia SQL
        
        return connection;
        
    }
    
    //Permite ejecutar Sentencias INSERT UPDATE y DELETE
    //retorna 1 en caso de ser exitoso y 0 si es null
    public static int ejecutarSQL(String sql) throws SQLException{
        System.out.println("Query: "+sql);
        return statement.executeUpdate(sql);
    }
    
    //Permite ejecutar Sentencias SELECT
    //retorna 1 objeto con informacion contenida de la sentencia SQL
    public static ResultSet ejecutarSQLSelect(String sql) throws SQLException{
        System.out.println("Query: "+sql);
        return statement.executeQuery(sql);
    }
}

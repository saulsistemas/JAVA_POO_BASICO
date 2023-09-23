
package principal;

//Clase principal para probar la conecion a la BD
import java.sql.Connection;
import connection.ConnectionFactory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    
    public static void main(String[] args) {
        try {
            //La conexion siempre va ser la misma por eso es estatica
            //vamos a crear una variable para guardar la conexion estatica
            Connection cnn  = ConnectionFactory.conectar();
            if (cnn != null) {
                System.out.println("Conexion Exitosa");
            }else{
                System.out.println("Error");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}


package dao;

import entity.Restaurante;
import java.sql.SQLException;
import java.util.List;
import myexceptions.RestauranteException;

/**
 *
 * Interface que representa el CRUD de transaccion para la tabla de tipo restaurante
 */
public interface RestauranteDAO {
        //metodo que permite guardar registro de tipo restaurante
    //retorna 1 si esta todo ok y 0 si esta mal
    //public abstract
    int guardar (Restaurante Restaurante)throws SQLException;
    
    //metodo que permite actualizar registro de tipo restaurante
    //retorna 1 si esta todo ok y 0 si esta mal
    int actualizar (Restaurante Restaurante)throws SQLException;
    
    //metodo que permite eliminar registro de tipo restaurante
    //retorna 1 si esta todo ok y 0 si esta mal
    int eliminar (int idRestaurante)throws SQLException;;
    
    //metodo que permite consultar registro de tipo restaurante
    //retorna 1 lista de tipo restaurante o null
    List<Restaurante> consultar()throws SQLException;
    
    //metodo que permite consultar registro de tipo id de tipo restaurante
    //retorna 1 lista de tipo restaurante o null
    Restaurante consultarPorId(int idRestaurante)throws SQLException,RestauranteException;
}

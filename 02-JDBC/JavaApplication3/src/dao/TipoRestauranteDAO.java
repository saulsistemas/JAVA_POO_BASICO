
package dao;

import entity.TipoRestaurante;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * Interface que representa el CRUD de transaccion para la tabla de tipo restaurante
 */
public interface TipoRestauranteDAO {
    //metodo que permite guardar registro de tipo restaurante
    //retorna 1 si esta todo ok y 0 si esta mal
    //public abstract
    int guardar (TipoRestaurante tipoRestaurante)throws SQLException;
    
    //metodo que permite actualizar registro de tipo restaurante
    //retorna 1 si esta todo ok y 0 si esta mal
    int actualizar (TipoRestaurante tipoRestaurante)throws SQLException;
    
    //metodo que permite eliminar registro de tipo restaurante
    //retorna 1 si esta todo ok y 0 si esta mal
    int eliminar (int idTipoRestaurante)throws SQLException;;
    
    //metodo que permite consultar registro de tipo restaurante
    //retorna 1 lista de tipo restaurante o null
    List<TipoRestaurante> consultar()throws SQLException;
    
    //metodo que permite consultar registro de tipo id de tipo restaurante
    //retorna 1 lista de tipo restaurante o null
    TipoRestaurante consultarPorId(int idTipoRestaurante)throws SQLException;
}

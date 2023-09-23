
package dao;

import entity.TipoRestaurante;
import java.util.List;

/**
 *
 * Interface que representa el CRUD de transaccion para la tabla de tipo restaurante
 */
public interface TipoRestauranteDAO {
    //metodo que permite guardar registro de tipo restaurante
    //retorna 1 si esta todo ok y 0 si esta mal
    //public abstract
    int guardar (TipoRestaurante tipoRestaurante);
    
    //metodo que permite actualizar registro de tipo restaurante
    //retorna 1 si esta todo ok y 0 si esta mal
    int actualizar (TipoRestaurante tipoRestaurante);
    
    //metodo que permite eliminar registro de tipo restaurante
    //retorna 1 si esta todo ok y 0 si esta mal
    int eliminar (int idTipoRestaurante);
    
    //metodo que permite consultar registro de tipo restaurante
    //retorna 1 lista de tipo restaurante o null
    List<TipoRestaurante> consultar();
    
    //metodo que permite consultar registro de tipo id de tipo restaurante
    //retorna 1 lista de tipo restaurante o null
    TipoRestaurante consultarPorId(int idTipoRestaurante);
}

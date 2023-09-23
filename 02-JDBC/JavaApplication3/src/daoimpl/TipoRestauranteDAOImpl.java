
package daoimpl;

import connection.ConnectionFactory;
import dao.TipoRestauranteDAO;
import entity.TipoRestaurante;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * Clase que implementa el crud y otros metodos  persononalizado
 * de transacciones a la base de datos en la tabla
 */
public class TipoRestauranteDAOImpl implements TipoRestauranteDAO{
    
    static{
        try {
            ConnectionFactory.conectar();
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Error en la BD "+ ex.getMessage());    
        }
    }
    @Override
    public int guardar(TipoRestaurante tipoRestaurante) throws SQLException{
        int numero = tipoRestaurante.isEstatus()? 1 : 0;
        String sql = "INSERT INTO tipo_restaurante (descripcion, fechaCreacion, estatus) VALUES ('"+ tipoRestaurante.getDescripcion()+"', '"+tipoRestaurante.getFechaCreacion()+"', '"+numero+"')";
      
        int ejecutado = ConnectionFactory.ejecutarSQL(sql);

        return ejecutado;
    }

    @Override
    public int actualizar(TipoRestaurante tipoRestaurante)throws SQLException {
        int numero = tipoRestaurante.isEstatus()? 1 : 0;
        String sql = "UPDATE tipo_restaurante SET descripcion='"+tipoRestaurante.getDescripcion()+"', fechaModificacion='"+tipoRestaurante.getFechaModificacion()+"', estatus='"+numero+"' "
                + "WHERE idTipoRestaurante='"+tipoRestaurante.getIdTipoRestaurante()+"';";
      
        int ejecutado = ConnectionFactory.ejecutarSQL(sql);

        return ejecutado;
    }

    @Override
    public int eliminar(int idTipoRestaurante)throws SQLException {
       
        String sql = "DELETE FROM tipo_restaurante WHERE idTipoRestaurante='"+idTipoRestaurante+"';";
      
        int ejecutado = ConnectionFactory.ejecutarSQL(sql);

        return ejecutado;
    }

    @Override
    public List<TipoRestaurante> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TipoRestaurante consultarPorId(int idTipoRestaurante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

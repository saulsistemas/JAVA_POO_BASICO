
package daoimpl;

import connection.ConnectionFactory;
import dao.TipoRestauranteDAO;
import entity.TipoRestaurante;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

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
    public List<TipoRestaurante> consultar()throws SQLException {
        String sql = "SELECT * FROM restaurante.tipo_restaurante;";
      
        ResultSet rs = ConnectionFactory.ejecutarSQLSelect(sql);
        List<TipoRestaurante> tiposRestaurantes = new ArrayList<>();
        
        if (rs!=null) {
            //Miestras el rs tenga valor
            while (rs.next()) {
                TipoRestaurante tipoRestaurante = new TipoRestaurante();
                tipoRestaurante.setIdTipoRestaurante(rs.getInt("idTipoRestaurante"));
                tipoRestaurante.setDescripcion(rs.getString("descripcion"));
                tipoRestaurante.setFechaCreacion(rs.getTimestamp("fechaCreacion").toLocalDateTime());
                tipoRestaurante.setFechaModificacion(rs.getTimestamp("fechaModificacion") !=null ? rs.getTimestamp("fechaModificacion").toLocalDateTime():null);
                tipoRestaurante.setEstatus(rs.getBoolean("estatus"));
                tiposRestaurantes.add(tipoRestaurante);
            }
        }
        return tiposRestaurantes;
    }

    @Override
    public TipoRestaurante consultarPorId(int idTipoRestaurante)throws SQLException {
        String sql = "SELECT * FROM tipo_restaurante WHERE idTipoRestaurante ='"+idTipoRestaurante+"';";
      
        ResultSet rs = ConnectionFactory.ejecutarSQLSelect(sql);
        TipoRestaurante tipoRestaurante = null;
        
        if (rs!=null) {
            //Miestras el rs tenga valor
            if (rs.next()) {
                tipoRestaurante = new TipoRestaurante();
                tipoRestaurante.setIdTipoRestaurante(rs.getInt("idTipoRestaurante"));
                tipoRestaurante.setDescripcion(rs.getString("descripcion"));
                tipoRestaurante.setFechaCreacion(rs.getTimestamp("fechaCreacion").toLocalDateTime());
                tipoRestaurante.setFechaModificacion(rs.getTimestamp("fechaModificacion") !=null ? rs.getTimestamp("fechaModificacion").toLocalDateTime():null);
                tipoRestaurante.setEstatus(rs.getBoolean("estatus"));
            }
                
            
        }
        return tipoRestaurante;
    }
    
}

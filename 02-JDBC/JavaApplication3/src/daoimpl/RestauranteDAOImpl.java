
package daoimpl;

import connection.ConnectionFactory;
import dao.RestauranteDAO;
import entity.Restaurante;
import java.sql.SQLException;
import java.util.List;
import myexceptions.RestauranteException;

/**
 *
 * @author HELPNET
 */
public class RestauranteDAOImpl implements RestauranteDAO{
    static{
        try {
            ConnectionFactory.conectar();
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("Error en la BD "+ ex.getMessage());    
        }
    }
    @Override
    public int guardar(Restaurante restaurante) throws SQLException {
        int numero = restaurante.isEstatus()? 1 : 0;
        String sql = "INSERT INTO restaurante (nombre, imagen, slogan, idTipoRestaurante, fechaCreacion, estatus, idMenu) "
        + "VALUES ('"+ restaurante.getNombre()+"', '"+restaurante.getImagen()+"', '"+restaurante.getSlogan()+"','"+restaurante.getTipoRestaurante().getIdTipoRestaurante()+"', "
        + "'"+restaurante.getFechaCreacion()+"', '"+numero+"', '"+restaurante.getMenu().getIdMenu()+"')";
      
        int ejecutado = ConnectionFactory.ejecutarSQL(sql);

        return ejecutado;
    }

    @Override
    public int actualizar(Restaurante Restaurante) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminar(int idRestaurante) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Restaurante> consultar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Restaurante consultarPorId(int idRestaurante) throws SQLException, RestauranteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

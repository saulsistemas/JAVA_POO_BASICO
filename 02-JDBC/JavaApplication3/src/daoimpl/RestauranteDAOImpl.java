
package daoimpl;

import connection.ConnectionFactory;
import dao.RestauranteDAO;
import entity.Menu;
import entity.Restaurante;
import entity.TipoRestaurante;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public int actualizar(Restaurante restaurante) throws SQLException {
       int numero = restaurante.isEstatus()? 1 : 0;
        String sql = "UPDATE restaurante SET nombre='"+restaurante.getNombre()+"', imagen='"+restaurante.getImagen()+"',slogan='"+restaurante.getSlogan()
                +"',fechaModificacion='"+restaurante.getFechaModificacion()+"', estatus='"+numero+"', idTipoRestaurante='"+restaurante.getTipoRestaurante().getIdTipoRestaurante()+"', idMenu='"+restaurante.getMenu().getIdMenu()+"' "
                + "WHERE idRestaurante='"+restaurante.getIdRestaurante()+"';";
      
        int ejecutado = ConnectionFactory.ejecutarSQL(sql);

        return ejecutado;
       
    }

    @Override
    public int eliminar(int idRestaurante) throws SQLException {
        String sql = "DELETE FROM restaurante WHERE idRestaurante='"+idRestaurante+"';";
      
        int ejecutado = ConnectionFactory.ejecutarSQL(sql);

        return ejecutado;
    }

    @Override
    public List<Restaurante> consultar() throws SQLException {
        String sql = "SELECT * FROM restaurante;";
      
        ResultSet rs = ConnectionFactory.ejecutarSQLSelect(sql);
        List<Restaurante> restaurantes = new ArrayList<>();
        
        if (rs!=null) {
            //Miestras el rs tenga valor
            while (rs.next()) {
                Restaurante restaurante = new Restaurante();
                restaurante.setIdRestaurante(rs.getInt("idRestaurante"));
                restaurante.setNombre(rs.getString("nombre"));
                restaurante.setImagen(rs.getString("imagen"));
                restaurante.setSlogan(rs.getString("slogan"));
                restaurante.setFechaCreacion(rs.getTimestamp("fechaCreacion").toLocalDateTime());
                restaurante.setFechaModificacion(rs.getTimestamp("fechaModificacion") !=null ? rs.getTimestamp("fechaModificacion").toLocalDateTime():null);
                restaurante.setEstatus(rs.getBoolean("estatus"));
                
                TipoRestaurante tipoRestaurante = new TipoRestaurante();
                tipoRestaurante.setIdTipoRestaurante(rs.getInt("idTipoRestaurante"));
                restaurante.setTipoRestaurante(tipoRestaurante);
        
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt("idMenu"));
                restaurante.setMenu(menu);
        
                
                
                restaurantes.add(restaurante);
            }
        }
        return restaurantes;
    }

    @Override
    public Restaurante consultarPorId(int idRestaurante) throws SQLException, RestauranteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

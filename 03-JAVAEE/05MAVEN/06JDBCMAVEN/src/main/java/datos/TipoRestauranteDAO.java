
package datos;

import domain.TipoRestaurante;
import java.sql.*;
import java.util.*;


public class TipoRestauranteDAO {
    private static final String SQL_SELECT="SELECT idTipoRestaurante,descripcion,fechaCreacion,fechaModificacion,estatus FROM tipo_restaurante";
    
    public List<TipoRestaurante> seleccionar() throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TipoRestaurante tipoRestaurante = null;
        List<TipoRestaurante> trs = new ArrayList<>();
        
        conn = Conexion.getConnection();
        stmt = conn.prepareStatement(SQL_SELECT);
        rs = stmt.executeQuery();
        while (rs.next()) {            
            tipoRestaurante = new TipoRestaurante();
                tipoRestaurante.setIdTipoRestaurante(rs.getInt("idTipoRestaurante"));
                tipoRestaurante.setDescripcion(rs.getString("descripcion"));
                tipoRestaurante.setFechaCreacion(rs.getTimestamp("fechaCreacion").toLocalDateTime());
                tipoRestaurante.setFechaModificacion(rs.getTimestamp("fechaModificacion") !=null ? rs.getTimestamp("fechaModificacion").toLocalDateTime():null);
                tipoRestaurante.setEstatus(rs.getBoolean("estatus"));
                trs.add(tipoRestaurante);
        }
        Conexion.close(rs);
        Conexion.close(stmt);
        Conexion.close(conn);
        
        
        return trs;
        
    }
}

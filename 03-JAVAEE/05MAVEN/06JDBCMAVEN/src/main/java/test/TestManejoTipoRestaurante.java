
package test;

import datos.TipoRestauranteDAO;
import domain.TipoRestaurante;
import java.sql.SQLException;
import java.util.List;

public class TestManejoTipoRestaurante {
    public static void main(String[] args) throws SQLException {
        TipoRestauranteDAO trDAO = new TipoRestauranteDAO();
        List<TipoRestaurante> tp = trDAO.seleccionar();
        
        for(TipoRestaurante tipo: tp ) {
            System.out.println("Tipo Res " + tipo);
        }
    }
 
}

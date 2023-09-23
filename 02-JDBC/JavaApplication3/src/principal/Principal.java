
package principal;

//Clase principal para probar la conecion a la BD

import daoimpl.TipoRestauranteDAOImpl;
import entity.TipoRestaurante;
import java.sql.SQLException;
import java.time.LocalDateTime;




public class Principal {
    
    public static void main(String[] args) {
        TipoRestauranteDAOImpl tpresDAOImpl = new TipoRestauranteDAOImpl();
        //:::::::::::::::::: PRUEBA INSERT :::::::::::::::::::::::
//        TipoRestaurante tpresEntity = new TipoRestaurante();
//        tpresEntity.setDescripcion("Argentino");
//        tpresEntity.setFechaCreacion(LocalDateTime.now());
//        tpresEntity.setEstatus(true);
//        
//        
//        try {
//            int guardado = tpresDAOImpl.guardar(tpresEntity);
//            if (guardado>0) {
//                System.out.println("El tipo de restaurante "+ tpresEntity.getDescripcion());
//            }else{
//                System.err.println("Hubo un error al guardar el tipo de restaurante");
//            }
//        } catch (SQLException ex) {
//            System.err.println("Error "+ex.getMessage());
//        }



        //:::::::::::::::::: PRUEBA UPDATE :::::::::::::::::::::::
        TipoRestaurante tpresEntity = new TipoRestaurante();
        tpresEntity.setIdTipoRestaurante(18);
        tpresEntity.setDescripcion("Colombiano");
        tpresEntity.setFechaModificacion(LocalDateTime.now());
        tpresEntity.setEstatus(false);
        try {
            int guardado = tpresDAOImpl.actualizar(tpresEntity);
            if (guardado>0) {
                System.out.println("El tipo de restaurante "+ tpresEntity.getDescripcion());
            }else{
                System.err.println("Hubo un error al actualizar el tipo de restaurante");
            }
        } catch (SQLException ex) {
            System.err.println("Error "+ex.getMessage());
        }
         
        
    }
    
    
}

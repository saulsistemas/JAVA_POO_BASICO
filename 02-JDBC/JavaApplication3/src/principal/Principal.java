
package principal;

//Clase principal para probar la conecion a la BD

import daoimpl.TipoRestauranteDAOImpl;
import entity.TipoRestaurante;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import myexceptions.RestauranteException;





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
//        TipoRestaurante tpresEntity = new TipoRestaurante();
//        tpresEntity.setIdTipoRestaurante(18);
//        tpresEntity.setDescripcion("Colombiano");
//        tpresEntity.setFechaModificacion(LocalDateTime.now());
//        tpresEntity.setEstatus(false);
//        try {
//            int guardado = tpresDAOImpl.actualizar(tpresEntity);
//            if (guardado>0) {
//                System.out.println("El tipo de restaurante "+ tpresEntity.getDescripcion());
//            }else{
//                System.err.println("Hubo un error al actualizar el tipo de restaurante");
//            }
//        } catch (SQLException ex) {
//            System.err.println("Error "+ex.getMessage());
//        }

//        //:::::::::::::::::: PRUEBA DELETE :::::::::::::::::::::::
//        TipoRestaurante tpresEntity = new TipoRestaurante();
//        tpresEntity.setIdTipoRestaurante(18);
//
//        try {
//            int eliminado = tpresDAOImpl.eliminar(tpresEntity.getIdTipoRestaurante());
//            if (eliminado>0) {
//                System.out.println("El tipo de restaurante fue eliminado" );
//            }else{
//                System.err.println("Hubo un error al Elimnar el tipo de restaurante");
//            }
//        } catch (SQLException ex) {
//            System.err.println("Error "+ex.getMessage());
//        }

////:::::::::::::::::: PRUEBA SELECT :::::::::::::::::::::::
//        try {
//            List<TipoRestaurante> tiposConsultados= tpresDAOImpl.consultar();
//            
//            for (TipoRestaurante tiposConsultado : tiposConsultados) {
//                System.out.println("ID: "+tiposConsultado.getIdTipoRestaurante());
//                System.out.println("DESCRIPCION: "+tiposConsultado.getDescripcion());
//                System.out.println("ESTADO: "+tiposConsultado.isEstatus()+"\n");
//                
//            }
//            
//        } catch (SQLException ex) {
//            System.err.println("Error "+ex.getMessage());
//        }
        
      //:::::::::::::::::: PRUEBA SELECT :::::::::::::::::::::::
        try {
           TipoRestaurante tiposConsultado = tpresDAOImpl.consultarPorId(15);
            
            if (tiposConsultado!=null) {
                 System.out.println("ID: "+tiposConsultado.getIdTipoRestaurante());
                System.out.println("DESCRIPCION: "+tiposConsultado.getDescripcion());
                System.out.println("ESTADO: "+tiposConsultado.isEstatus()+"\n");
            }
               
                
            
            
        } catch (SQLException ex) {
            System.err.println("Error "+ex.getMessage());
        } catch (RestauranteException ex) {
            System.out.println(ex.getErrorCode());
            
        }  
        
    }
    
    
}

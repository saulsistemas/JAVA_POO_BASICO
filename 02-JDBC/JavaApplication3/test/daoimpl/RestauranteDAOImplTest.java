/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package daoimpl;

import entity.Menu;
import entity.Restaurante;
import entity.TipoRestaurante;
import java.time.LocalDateTime;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


/**
 *
 * @author HELPNET
 */
public class RestauranteDAOImplTest {
    
    public RestauranteDAOImplTest() {
    }

    @Test
    public void testGuardar() throws Exception {
        RestauranteDAOImpl rtDAOImpl = new RestauranteDAOImpl();
        
        Restaurante restaurante = new Restaurante();
        restaurante.setNombre("Restaurante Emily3");
        restaurante.setImagen("Emily.jpg");
        restaurante.setSlogan("El mejor restauran");
        restaurante.setEstatus(true);
        restaurante.setFechaCreacion(LocalDateTime.now());
        
        TipoRestaurante tipoRestaurante = new TipoRestaurante();
        tipoRestaurante.setIdTipoRestaurante(15);
        restaurante.setTipoRestaurante(tipoRestaurante);
        
        Menu menu = new Menu();
        menu.setIdMenu(3);
        restaurante.setMenu(menu);
        int guardado =0;
        try {
            guardado = rtDAOImpl.guardar(restaurante);
        
            assertTrue(guardado > 0); 
            System.out.println("Se guardo Exitosamente");
        } catch (Exception e) {
            assertTrue(guardado == 0); 
            System.err.println("No se guardo "+e.getMessage());
        }
       
    }

    @Test
    public void testActualizar() throws Exception {
        RestauranteDAOImpl rtDAOImpl = new RestauranteDAOImpl();
        
        Restaurante restaurante = new Restaurante();
        restaurante.setIdRestaurante(21);
        restaurante.setNombre("Restaurante Emily+5");
        restaurante.setImagen("Emily.jpg");
        restaurante.setSlogan("El mejor restauran");
        restaurante.setEstatus(false);
        restaurante.setFechaModificacion(LocalDateTime.now());
        
        TipoRestaurante tipoRestaurante = new TipoRestaurante();
        tipoRestaurante.setIdTipoRestaurante(15);
        restaurante.setTipoRestaurante(tipoRestaurante);
        
        Menu menu = new Menu();
        menu.setIdMenu(3);
        restaurante.setMenu(menu);
        int guardado =0;
        try {
            guardado = rtDAOImpl.actualizar(restaurante);
        
            assertTrue(guardado > 0); 
            System.out.println("Se guardo Exitosamente");
        } catch (Exception e) {
            assertTrue(guardado == 0); 
            System.err.println("No se guardo "+e.getMessage());
        }
    }

    @Test
    public void testEliminar() throws Exception {
        RestauranteDAOImpl rtDAOImpl = new RestauranteDAOImpl();
        Restaurante restaurante = new Restaurante();
        restaurante.setIdRestaurante(21);
        try {
            int eliminado = rtDAOImpl.eliminar(restaurante.getIdRestaurante());
        
            assertTrue(eliminado > 0); 
            System.out.println("Se elimino Exitosamente");
        } catch (Exception e) {
             
            System.err.println("No se guardo "+e.getMessage());
        }
        
    }

    @Test
    public void testConsultar() throws Exception {
         RestauranteDAOImpl rtDAOImpl = new RestauranteDAOImpl();
         
         try {
             List<Restaurante> tiposConsultados= rtDAOImpl.consultar();
             
            for (Restaurante tiposConsultado : tiposConsultados) {
                System.out.println("ID: "+tiposConsultado.getIdRestaurante());
                System.out.println("NOMBRE: "+tiposConsultado.getNombre());
                System.out.println("ESTADO: "+tiposConsultado.isEstatus()+"\n");
            }
        } catch (Exception e) {
            System.err.println("Error "+e.getMessage());
        }
    }

    @Test
    public void testConsultarPorId() throws Exception {
    }
    
}

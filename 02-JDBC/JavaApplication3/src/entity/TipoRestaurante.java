
package entity;
import java.util.List;

/**
 *
 * Clase que representa una entidad de tipo restaurante en la BD
 */
public class TipoRestaurante extends CommonEntity{
    private int idTipoRestaurante;
    private String descripcion;


    private List<Restaurante> restaurantes;

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }
    
    public int getIdTipoRestaurante() {
        return idTipoRestaurante;
    }

    public void setIdTipoRestaurante(int idTipoRestaurante) {
        this.idTipoRestaurante = idTipoRestaurante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}

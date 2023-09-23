
package entidad;

/**
 *
 * Clase que representa la evolucion de un Pokemon
 */
public class Evolucion {
    private int id;
    private String nombre;
    private boolean estado;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

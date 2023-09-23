
package entidad;

/**
 *
 * @author HELPNET
 */
public class Pokebola {
    private int id;
    private String nombre;
    private String imagen;

    public Pokebola(int id, String nombre, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Pokebola() {
    }
    
     public int getId() {
        return id;
    }
    //vas darle valor a una propiedad de la clase.
    //el id que esta entre parentecis lo vas asignar a la propiedad de tu clase
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}


package entidad;

/**
 * Clase - Es una plantilla que contienen la estructura básica de un objeto (Atributos y Métodos).
 * Atributos - característica o propiedad determinada de un objeto.
 * Atributos de una clase, siempre se definen al inicio, fuera de cualquier metodo.
 */
public class Pokemon {
    private int id;
    private String nombre;
    private String tipo;
    private String imagen;
    private String evoluciones;
    private boolean estado;
/**
 * 
 * Encapsulamiento - Las clases Java no accedan directeamente a los atributos de una clase
 * 
     * @return 
 */  
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEvoluciones() {
        return evoluciones;
    }

    public void setEvoluciones(String evoluciones) {
        this.evoluciones = evoluciones;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
 
    
    
}

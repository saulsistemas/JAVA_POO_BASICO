
package entidad;

/**
 * Clase - Es una plantilla que contienen la estructura básica de un objeto (Atributos y Métodos).
 * Atributos - característica o propiedad determinada de un objeto.
 * Atributos de una clase, siempre se definen al inicio, fuera de cualquier metodo.
 */

//Herencia -permite que se puedan definir nuevas clases basadas de unas ya existentes
//a fin de reutilizar el código
public class Pokemon extends Pokebola{
   
    private String tipo;
    // HAS -A - Tiene un, tiene muchos, una clase java puede tener ciertos elementos de un objeto
    // un pokemon puede tener varias evoluciones
    private Evolucion evoluciones;
    private boolean estado;

    //Constructor -método especial que se utiliza para inicializar un objeto
    //recién creado y asignarle valores iniciales a sus variables de instancia
    public Pokemon() {
       
    }



    public Pokemon(int id, String nombre, String imagen,  String tipo,Evolucion evoluciones, boolean estado) {
        super(id,nombre,imagen);
        this.evoluciones = evoluciones;
        this.estado = estado;
    }
    
    
/**
 * 
 * Encapsulamiento - Las clases Java no accedan directeamente a los atributos de una clase
 * 
     * @return 
 */  
   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Evolucion getEvoluciones() {
        return evoluciones;
    }

    public void setEvoluciones(Evolucion evoluciones) {
        this.evoluciones = evoluciones;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
 
    
    
}

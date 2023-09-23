
package principal;

import entidad.Evolucion;
import entidad.Pokemon;

/**
 *
 * @author HELPNET
 */
public class Principal {
    public static void main(String[] args) {
        //Objeto = Es un espécimen o instancia de una clase.
        //TipoObjeto nombre = new TipoObjeto()
        System.out.println("::::::::::::: POKEMON1 :::::::::::::::::::");
        
        Pokemon pokemon1 = new Pokemon();
        
        System.out.println("::::::::::::: EVOLUCIONES :::::::::::::::::::");
        Evolucion evolucion1 = new Evolucion();
        evolucion1.setId(1);
        evolucion1.setNombre("Charmeleon");
        evolucion1.setEstado(true);
                
        pokemon1.setId(1);        
        pokemon1.setNombre("Charmander");
        pokemon1.setTipo("Fuego");
        pokemon1.setImagen("pokemon1.jpg");
        pokemon1.setEvoluciones(evolucion1);
        pokemon1.setEstado(true);
        
        System.out.println("::::::::::::: Encapsulamiento Get/Set :::::::::::::::::::");
        
        System.out.println("Los datos de los pokemon son los siguientes: ");
        System.out.println("Id: "+ pokemon1.getId());
        System.out.println("Nombre: "+ pokemon1.getNombre());
        System.out.println("Tipo: "+ pokemon1.getTipo());
        System.out.println("Imagen: "+ pokemon1.getImagen());
        System.out.println("Evoluciones: "+ pokemon1.getEvoluciones().getNombre());
        String estado = pokemon1.isEstado()?"Habilitado":"Deshabilitado";
        System.out.println("Estado: "+ estado);
        //System.out.println(pokemon1.toString());
        
        System.out.println("::::::::::::: POKEMON2 :::::::::::::::::::");
        
        Pokemon pokemon2 = new Pokemon();
        
        System.out.println("::::::::::::: EVOLUCIONES :::::::::::::::::::");
        Evolucion evolucion2 = new Evolucion();
        evolucion2.setId(2);
        evolucion2.setNombre("Wartortle");
        evolucion2.setEstado(true);
        
        pokemon2.setId(2);        
        pokemon2.setNombre("Squirtle");
        pokemon2.setTipo("Agua");
        pokemon2.setImagen("pokemon2.jpg");
        pokemon2.setEvoluciones(evolucion2);
        
        pokemon2.setEstado(false);
        
        System.out.println("::::::::::::: Encapsulamiento Get/Set :::::::::::::::::::");
        
        System.out.println("Los datos de los pokemon son los siguientes: ");
        System.out.println("Id: "+ pokemon2.getId());
        System.out.println("Nombre: "+ pokemon2.getNombre());
        System.out.println("Tipo: "+ pokemon2.getTipo());
        System.out.println("Imagen: "+ pokemon2.getImagen());
        System.out.println("Evoluciones: "+ pokemon2.getEvoluciones().getNombre());
        String estado2 = pokemon2.isEstado()?"Habilitado":"Deshabilitado";
        System.out.println("Estado: "+ estado2);
        //System.out.println(pokemon1.toString());
        
    }
}

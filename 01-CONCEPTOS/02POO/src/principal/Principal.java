
package principal;

import entidad.Ataque;
import entidad.Evolucion;
import entidad.Pokemon;
import java.util.ArrayList;
import java.util.List;
import servicioImplementacion.PokemonServicioImple;

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
        
        Evolucion evolucion3 = new Evolucion();
        evolucion3.setId(3);
        evolucion3.setNombre("Charizard");
        evolucion3.setEstado(true);
        
        List<Evolucion> evoluciones1 = new ArrayList<>();
        evoluciones1.add(evolucion1);
        evoluciones1.add(evolucion3);   
        
        pokemon1.setId(1);        
        pokemon1.setNombre("Charmander");
        pokemon1.setTipo("Fuego");
        pokemon1.setImagen("pokemon1.jpg");
        pokemon1.setEvoluciones(evoluciones1);
        pokemon1.setEstado(true);
        
        System.out.println("::::::::::::: Encapsulamiento Get/Set :::::::::::::::::::");
        
       
        System.out.println("Id: "+ pokemon1.getId());
        System.out.println("Nombre: "+ pokemon1.getNombre());
        System.out.println("Tipo: "+ pokemon1.getTipo());
        System.out.println("Imagen: "+ pokemon1.getImagen());
        for (Evolucion evolucion : evoluciones1) {
            System.out.println("Evoluciones: "+ evolucion.getNombre());
        }
        
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
        
        Evolucion evolucion4 = new Evolucion();
        evolucion4.setId(4);
        evolucion4.setNombre("Blastoise");
        evolucion4.setEstado(true);
        
        List<Evolucion> evoluciones2 = new ArrayList<>();
        evoluciones2.add(evolucion2);
        evoluciones2.add(evolucion4);  
        
        pokemon2.setId(2);        
        pokemon2.setNombre("Squirtle");
        pokemon2.setTipo("Agua");
        pokemon2.setImagen("pokemon2.jpg");
        pokemon2.setEvoluciones(evoluciones2);
        
        pokemon2.setEstado(false);
        
        System.out.println("::::::::::::: Encapsulamiento Get/Set :::::::::::::::::::");
        
      
        System.out.println("Id: "+ pokemon2.getId());
        System.out.println("Nombre: "+ pokemon2.getNombre());
        System.out.println("Tipo: "+ pokemon2.getTipo());
        System.out.println("Imagen: "+ pokemon2.getImagen());
        for (Evolucion evolucion : evoluciones2) {
            System.out.println("Evoluciones: "+ evolucion.getNombre());
        }
        
        String estado2 = pokemon2.isEstado()?"Habilitado":"Deshabilitado";
        System.out.println("Estado: "+ estado2);
        //System.out.println(pokemon1.toString());
        
        
        System.out.println("::::::::::::: Funcionalidad de Ataque :::::::::::::::::::");
        Ataque ataque1 = new Ataque();
        ataque1.setId(1);
        ataque1.setNombre("Chorro de Agua");
        ataque1.setValor(6);
        pokemon2.setAtaques(ataque1);
        System.out.println("Los ataques del poquemon son : "+ pokemon2.getAtaques().getNombre() + " y el nivel es : "+pokemon2.getAtaques().getValor());
        
        System.out.println("::::::::::::: Añadiendo invocacion Ataques Implementacion: ::::::::::::::::::");
        PokemonServicioImple pokemonServicioImpl = new PokemonServicioImple();
        pokemonServicioImpl.ataque(pokemon2.getAtaques(), pokemon2);
        
        
        System.out.println("::::::::::::: ARREGLOS :::::::::::::::::::");
        List<String> listaDeCadenas = new ArrayList<>();
        listaDeCadenas.add("texto1");
        listaDeCadenas.add("texto2");
        
        for (int i = 0; i < listaDeCadenas.size(); i++) {
            System.out.println("Recorriendo por For : "+listaDeCadenas.get(i));
        }
        for (String listaDeCadena : listaDeCadenas) {
            System.out.println("Recorriendo por ForEach : "+listaDeCadena); 
       }
    }
}

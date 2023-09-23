
package principal;

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
        pokemon1.setId(1);        
        pokemon1.setNombre("Charmander");
        pokemon1.setTipo("Fuego");
        pokemon1.setImagen("pokemon1.jpg");
        pokemon1.setEvoluciones("Charmeleon, Charizard");
        pokemon1.setEstado(true);
        
        System.out.println("::::::::::::: Encapsulamiento Get/Set :::::::::::::::::::");
        
        System.out.println("Los datos de los pokemon son los siguientes: ");
        System.out.println("Id: "+ pokemon1.getId());
        System.out.println("Nombre: "+ pokemon1.getNombre());
        System.out.println("Tipo: "+ pokemon1.getTipo());
        System.out.println("Imagen: "+ pokemon1.getImagen());
        System.out.println("Evoluciones: "+ pokemon1.getEvoluciones());
        String estado = pokemon1.isEstado()?"Habilitado":"Deshabilitado";
        System.out.println("Estado: "+ estado);
        
                System.out.println("::::::::::::: POKEMON2 :::::::::::::::::::");
        
        Pokemon pokemon2 = new Pokemon();
        pokemon2.setId(2);        
        pokemon2.setNombre("Charmander");
        pokemon2.setTipo("Fuego");
        pokemon2.setImagen("pokemon1.jpg");
        pokemon2.setEvoluciones("Charmeleon, Charizard");
        pokemon2.setEstado(false);
        
        System.out.println("::::::::::::: Encapsulamiento Get/Set :::::::::::::::::::");
        
        System.out.println("Los datos de los pokemon son los siguientes: ");
        System.out.println("Id: "+ pokemon2.getId());
        System.out.println("Nombre: "+ pokemon2.getNombre());
        System.out.println("Tipo: "+ pokemon2.getTipo());
        System.out.println("Imagen: "+ pokemon2.getImagen());
        System.out.println("Evoluciones: "+ pokemon2.getEvoluciones());
        String estado2 = pokemon2.isEstado()?"Habilitado":"Deshabilitado";
        System.out.println("Estado: "+ estado2);
    }
}

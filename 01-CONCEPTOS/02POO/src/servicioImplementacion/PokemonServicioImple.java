
package servicioImplementacion;

import Servicio.PokemonServicio;
import entidad.Ataque;
import entidad.Pokemon;

/**
 *
 * Funcionalidad de las interfaces
 */
public class PokemonServicioImple implements PokemonServicio{

    @Override
    public void ataque(Ataque ataque, Pokemon pokemon) {
        String nombre = pokemon.getNombre();
        int nivel = ataque.getValor();
        
        if (nivel <=0) {
            System.out.println("El pokemon "+ nombre+ " es muy debilucho " + nivel);
        }else if(nivel>=1 && nivel<=5){
            System.out.println("El pokemon "+ nombre+ " esta mejorando su nivel "+nivel);
        }else{
            System.out.println("El pokemon "+ nombre+ " es de nivel Alto "+nivel);
        }
    }
    
}

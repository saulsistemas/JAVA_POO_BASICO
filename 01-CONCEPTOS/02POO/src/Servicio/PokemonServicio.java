
package Servicio;

import entidad.Ataque;
import entidad.Pokemon;

/**
 *
 * Interface - Es un contrato, obligatorio que se tiene que cumplir
 */
public interface PokemonServicio {
    //Los metodos pueden ser public abstract
    public abstract void ataque(Ataque ataque, Pokemon pokemon);
}

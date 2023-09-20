
package CLASE05;

/**
 *
 * La sentencia IF procesa un conjunto de sentencias basadas en 
 * el resultado de evaluar las expresiones de condición
 */
public class Pokemon {
    public static void main(String[] args) {
        boolean esPokemon = false;
        
        //::::::::::::::: IF ::::::::::::::::::
        //IF - Elsecon llaves
        if (esPokemon) {
            System.out.println("Si es un pokemon");
        }else{
            System.out.println("No es un pokemon");
        }
        //::::::::::::::: IF CON LLAVES ::::::::::::::::::
        //IF Sin llaves
        if(esPokemon)
            System.out.println("Si es un pokemon con If sin llaves");
        
        if(esPokemon)
            System.out.println("Si es un pokemon con segundo If sin llaves");
        else
            System.err.println("No es un pokemon con segundo If sin llaves");
       
       
        //::::::::::::::: IF ELSE IF ::::::::::::::::::
        
        String nombrePokemon = "pikachu";
        
        if(nombrePokemon.equals("pikachu")){
            System.out.println("su nombre es "+nombrePokemon);
        }else if(nombrePokemon.equals("charizard")){
            System.out.println("su nombre es "+nombrePokemon);
        }else{
            System.out.println("No se encontro nombre de pokemon ");
        }
        
        //::::::::::::::: OPERADOR TERNARIO ::::::::::::::::::
        
        String ternario = esPokemon ? "SI ES UN POKEMON" : "NO ES UN POKEMON";
        System.out.println("Resultado " +ternario);
    }    
}

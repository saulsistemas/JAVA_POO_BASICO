
package CLASE02;


public class Pokemon {
    public static void main(String[] args) {
        //Varible - contenedor de datos que almacena los valores durante la ejecución del programa Java 
        var resultado = sumaDePokemon(2, 3);
        System.out.println("La cantidad de Pokemon son "+resultado);
        
        //tipos de datos Primitivos
        //byte
        //short
        //char
        //int
        //long
        //float
        //double
        //boolean
    }
    
    public static int sumaDePokemon(int pokemon1, int pokemon2){
        var totalPokemon = pokemon1+pokemon2;
        return  totalPokemon;
    }
 
}

package CLASE10;

/**
 *
 * @author HELPNET
 */
public class Matriz {
    public static void main(String[] args) {
        
        System.out.println("::::::::::::::ARREGLOS 1:::::::::::::::::::::::");
        String[] pokemonesFuego = new String[3];
        pokemonesFuego[0] = "Charmander";        
        pokemonesFuego[1] = "Charmeleon";
        pokemonesFuego[2] = "Charizard";
     
        for (String pokemon : pokemonesFuego) {
            System.out.println("Los pokemones de fuego " + pokemon);
        }
        
        System.out.println("::::::::::::::ARREGLOS 2:::::::::::::::::::::::");
        
        String[] pokemonesAgua = {"Squirtle","Wartortle","Blastoise"};
        for (int i = 0; i < pokemonesAgua.length; i++) {
            System.out.println("Los pokemones de agua " + pokemonesAgua[i]);
        }

        System.out.println("::::::::::::::ARREGLOS BIDIMENCIONAL:::::::::::::::::::::::");
        //[FILA][COLUMNA]
        String[][]pokemones = {{"nombre","Charmander"},{"Tipo","fuego"}};
        
        for (int i = 0; i < pokemones.length; i++) {
            
            for (int j = 0; j < pokemones[i].length; j++) {
                System.out.println(pokemones[i][j]);
            }
        }
    }
}

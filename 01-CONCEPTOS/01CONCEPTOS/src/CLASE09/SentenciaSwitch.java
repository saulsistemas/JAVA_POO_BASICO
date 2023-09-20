
package CLASE09;

/**
 *
 * @author HELPNET
 */
public class SentenciaSwitch {
    public static void main(String[] args) {
        String pokemon = "charizard";
        
        switch (pokemon) {
            case "Pikachu":
                System.out.println("Es un pokemon de tipo electrico");
                break;
             case "charizard":
                System.err.println("Es un pokemon de tipo fuego");
                break;
            default:
                System.err.println("No es ningun Pokemon ");;
        }
    }
}


package CLASE03;

/**
 *
 * @author HELPNET
 */
public class Pokemon {
    //variable de instancia o varible global
    int nivelAtaque1 = 5;
    static int nivelAtaque2 = 4;
    
    
    public static void main(String[] args) {
        //variable local - se define dentro de los metodos
        var nivelAtaque3 = 10;
        System.out.println(nivelAtaque3);
        // creando una instancia de la clase pokemon
        Pokemon pk1 = new Pokemon();
        pk1.nivelUno();
        
        //Con un metodo estatico
        niveldos();
    }
    
    public void nivelUno(){
        System.out.println("El nivel de ataque es "+ this.nivelAtaque1);
    }
    
     public static void niveldos(){
        System.out.println("El nivel de ataque es "+ nivelAtaque2);
    }
}

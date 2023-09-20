
package CLASE06;

/**
 *
 *
 * Buble do Whitle - repetir una acción en un bucle siempre y cuando se cumpla una condición
 * primero se ejecuta una vez el código (do) y, a continuación, se evalúa la condición. 
 * 
 */
public class Pokemon {
    public static void main(String[] args) {
        int n=0;
        do{
            
            System.out.println("El número es: "+n);
            n+=1;
            //n++;
            //n=n+1;
        }while(n<10);
        
        bucleDoWhile(5);
    }
    
    public static void bucleDoWhile(int arg1){
        int cantidadPokemon =arg1;
        cantidadPokemon=4;
        int contador = 0;
        do{
            System.out.println("La cantidad de Pokemon "+contador);
            contador++;
        }while(contador<cantidadPokemon);
        
    }
}

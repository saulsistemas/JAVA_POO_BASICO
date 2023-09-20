
package CLASE07;

/**
 *
 * WHILE - la condición booleana se evalúa antes de que se ejecute el código
 */
public class While {
    public static void main(String[] args) {
        int n=0;
        while(n<10){
            
            System.out.println("El número es: "+n);
            n+=1;
            //n++;
            //n=n+1;
        }
        bucleWhile(5);
    }
     public static void bucleWhile(int arg1){
        int cantidadPokemon =arg1;
        cantidadPokemon=4;
        int contador = 3;
        
        while(contador<cantidadPokemon){
            System.out.println("La cantidad de Pokemon "+contador);
            contador++;
        }
        
    }
}


package CLASE01;
//Clase - Es una plantilla que contienen la estructura básica de un objeto (Atributos y Métodos).
public class Pokemon {
    //Métodos - Acciones o funciones que pueden ser llamadas dentro de la clase o por otra clase.
    //Parametros = lo que esta entre los parentesis
    
    //Static - permite acceder a las variables y métodos aunque no tengamos una instancia
    //del objeto que los contiene
    //Regla de Metodos estaticos, no pueden agregar metodos que no sean estaticos.
    
    public static void main(String[] args) {
        
        ataquePokemon("Trueno");
        ataquePokemon("Latigo");
        
//        Pokemon pk = new Pokemon();
//        pk.nombrePokemon();
    }
    
    //Ejemplo de metodos
    public void nombrePokemon(){
        System.out.println("Hola soy un pokemon");
        
    }
    
    public static void ataquePokemon(String ataque){
        System.out.println("Tengo los siguientes ataques "+ ataque);
    }
}

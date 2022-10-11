/*
 * 
 * Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
correspondiente traducción al castellano. Las palabras deben estar distribuidas
en dos columnas y alineadas a la izquierda.
Ejemplo:
computer ordenador
student alumno\a
cat gato
penguin pingüino
machine máquina
nature naturaleza
light luz
green verde
book libro
pyramid pirámide

 * 
 * @author KuzaFkto
 */

public class Ej3{
    public static void main(String[] args) {
        try {
            System.out.printf("%-12s %-12s \n","Español","Inglés");
            System.out.println("--------------------");
            System.out.printf("%-10s   %-10s \n","Talk","Hablar");
            System.out.printf("%-10s   %-10s\n","Speak","Hablar"); 
            System.out.printf("%-10s   %-10s\n","Chat","Hablar"); 
            System.out.printf("%-10s   %-10s\n","Gossip","Hablar (chismes)"); 
            System.out.printf("%-10s   %-10s\n","Punch","Golpe");  
            System.out.printf("%-10s   %-10s\n","Strike","Golpe");  
            System.out.printf("%-10s   %-10s\n","Hit","Golpe");  
            System.out.printf("%-10s   %-10s\n","Bear","Oso");  
            System.out.printf("%-10s   %-10s\n","Beer","Cerveza"); 
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");            }
  
    }
}
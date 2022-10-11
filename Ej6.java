/*
 * Escribe un programa que pinte por pantalla una pirámide rellena a base de
asteriscos. La base de la pirámide debe estar formada por 9 asteriscos.
Ejemplo:
    *
   ***
  *****
 *******
*********
 * 
 * @author KuzaFkto
 */

public class Ej6{
    public static void main(String[] args) {
        try {
            System.out.println("    *");
            System.out.println("   ***");
            System.out.println("  *****");
            System.out.println(" *******");
            System.out.println("*********");
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");          }
        
    }
}
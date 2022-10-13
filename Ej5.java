/*
 * Modifica el programa anterior añadiendo colores. 
 * Puedes mostrar cada asignatura de un color diferente
 * 
 * @author KuzaFkto
 */

public class Ej5{
    public static void main(String[] args) {
    
            String verde =  "\033[32m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        String celeste = "\033[36m";
        String blanco = "\033[37m";
        String violeta = "\033[35m";
        String rojo = "\033[31m";
    

        System.out.printf(" %-11s %-12s %-12s %-11s %-12s %-12s\n","Hora","Lunes","Martes","Miercoles","Jueves","Viernes");
        System.out.printf("--------------------------------------------------------------------------------------------------\n");
        System.out.printf("%-17s %-17s %-17s %-17s %-17s %-17s\n",blanco+"8:15",azul+"Prog",rojo+"Sistemas",verde+"Entornos",azul+"Prog",violeta+"FOL");
        System.out.printf("%-17s %-17s %-17s %-17s %-17s %-17s\n",blanco+"9:15",azul+"Prog",rojo+"Sistemas",verde+"Entornos",azul+"Prog",violeta+"FOL");
        System.out.printf("%-17s %-17s %-17s %-17s %-17s %-17s\n",blanco+"10:15",naranja+"Lenguajes",rojo+"Sistemas",verde+"Entornos",azul+"Prog",violeta+"FOL");
        System.out.printf("%-17s %-17s %-17s %-17s %-17s %-17s\n",blanco+"11:15",naranja+"Lenguajes",rojo+"Sistemas",azul+"Prog",naranja+"Lenguajes",rojo+"Sistemas");
        System.out.printf("%-17s %-12s %-12s %-12s %-12s %-13s\n",blanco+"Recreo","Recreo","Recreo","Recreo","Recreo","Recreo");
        System.out.printf("%-17s %-17s %-17s %-17s %-17s %-17s\n",blanco+"11:45",naranja+"Lenguajes",azul+"Prog",azul+"Prog",naranja+"Lenguajes",rojo+"Sistemas");
        System.out.printf("%-17s %-17s %-17s %-17s %-17s %-17s\n",blanco+"12:45",celeste+"BBDD",azul+"Prog",celeste+"BBDD",celeste+"BBDD",rojo+"Sistemas");
        System.out.printf("%-17s %-17s %-17s %-17s %-17s %-17s\n",blanco+"13:45",celeste+"BBDD",verde+"Entornos",celeste+"BBDD",celeste+"BBDD",rojo+"Sistemas");
        System.out.printf("%-17s %-17s %-17s %-17s %-17s %-17s\n",blanco+"14:45",celeste+"BBDD",verde+"Entornos",celeste+"BBDD",celeste+"BBDD",rojo+"Sistemas");

       

        

    }
}
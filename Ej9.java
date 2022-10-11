/*
 * Escribe un programa que pinte por pantalla alguna escena - el campo, la
habitación de una casa, un aula, etc. - o algún objeto animado o inanimado
- un coche, un gato, una taza de café, etc. Ten en cuenta que puedes utilizar
caracteres como *, +, <, #, @, etc. o incluso caracteres Unicode. ¡Échale
imaginación!.

 * @author KuzaFkto
 */

public class Ej9{
    public static void main(String[] args) {

        try {
            System.out.println("         ____");
            System.out.println("        /___/\\_");
            System.out.println("       _\\   \\/_/\\__");
            System.out.println("     __\\       \\/_/\\");
            System.out.println("     \\   __    __ \\ \\");
            System.out.println("    __\\  \\_\\   \\_\\ \\ \\   __");
            System.out.println("   /_/\\    __   __  \\ \\_/_/\\");
            System.out.println("   \\_\\/_\\__\\/\\__\\/\\__\\/_\\_\\/");
            System.out.println("      \\_\\/_/\\       /_\\_\\/");
            System.out.println("         \\_\\/       \\_\\/");
        } catch (Exception e) {
            System.out.println("Error! ");
            System.out.println("Por favor, ejecute el código de nuevo");    
                }
       
    }
}
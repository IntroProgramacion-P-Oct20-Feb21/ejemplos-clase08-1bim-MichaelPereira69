  
/*
    El siguiente programa muestra de forma infinita la frase:
    Usted está en el ciclo
    Modificar el código para que el usuario decida si quiere seguir en el ciclo
    El usuario podrá salir con las siguiente opciones:
    SI
    Si
    SI
    si
    sI
    S
    s
 */
package ejemplosrepaso;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String Salirse;
        boolean bandera = true;
        while (bandera) {
          System.out.println("Usted esta en un ciclo\n"
          + " ¿Desea Salirse del ciclo?, digite Si ó sI");
          Salirse = entrada.nextLine();
          Salirse = Salirse.toLowerCase();
          switch (Salirse){
                case "si":case "s":
                bandera = false;
                break;
            }
        }
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {

         float num; /*Numerador*/
         float denom; /*Denominador*/
         Scanner teclado = new Scanner(System.in);
         boolean ok = true;
         while(ok) {
             try {
                System.out.println(".(Ingrese el Numerador : )");
                num = teclado.nextFloat();
                System.out.println(".(Ingrese el Denominador : )");
                denom = teclado.nextFloat();
                System.out.println("La division entre "+num+" y "+denom+" es = " +(num/denom));
            } catch (InputMismatchException eime) {
                System.err.println("Debe digitar un numero ");
            } catch (IllegalStateException) {
                System.err.println("Error "+eise.IllegalStateException.toString()");
            }
            }finally{
                 Scanner.close();
                 System.out.println("Programa terminado normalmente ");
            }

        }
                 
    }

}




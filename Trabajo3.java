
import java.util.Scanner;

public class Trabajo3{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tablas de Multiplicar");

       int inicio,terminar,number;
        int multiplicacion =0;

            System.out.print("\nDigite que tabla de multiiplicar quiere: ");
        number = entrada.nextInt();

        System.out.print("Digite el inicio de la tabla de multiplicar : ");
        inicio = entrada.nextInt();
        System.out.print("Digite el final de la tabla de la tabla de multiplicar :");
        terminar = entrada.nextInt();

       
            System.out.println("\nSu tabla de multiplicar es es: \n");
            for (int i = inicio; i <= terminar ;i++ ){
                multiplicacion = number*i;
                System.out.println(number + " x " + i +" = "+multiplicacion);
            }

      



    }
}


import java.util.Scanner;

public class TrabajoClase2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int number;
        int mult =0;
        int i=0;

    System.out.println("Tablas de Multiplicar");

        do {

            i=0;
            System.out.print("\nDigite que tabla de multiplicar quiere (0 al 12): ");
            number = entrada.nextInt();

            if (number>0 && number < 13 ) {
                System.out.println("Su tabla del " + number + " es: \n");
               
            

           

                while (i <= 10) {
                    mult = number * i;
                    System.out.println(number + " x " + i + " = " + mult);
                    i++;

                }

            }


        }while (number>0 && number < 13);
        


    }
}



import java.util.Scanner;

public class TrabajoClase1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int number;
        int multiplicacion =0;
        int f=0;
        

        System.out.println("Tablas de Multiplicar");
        
        do{
            System.out.print("\nDigite que tabla de multiplicar quiere (0 al 12): ");
            number = entrada.nextInt();
            
            
               if(number>0 && number < 13){          
                System.out.println("La tabla del " + number + " es: \n");
               
  
                for (int i=0;i <= 10;i++) {
                    multiplicacion = number * i;
                    System.out.println(number + " x " + i + " = " + multiplicacion);
                }
               }

            }while (number>0 && number < 13);

        

  
    }
}

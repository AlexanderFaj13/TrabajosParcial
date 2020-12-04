

import java.util.Scanner;

public class Trabajo7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcular letras de una cadena");
        String cadena;
       
        System.out.println("Ingrese una Palabra para saber sus vocales: ");
        cadena = entrada.nextLine();
      
         char palabras[] = new char[cadena.length()];//guardando espacio en memoria para la palabra
         
         for (int i = 0; i < cadena.length(); i++) {
            palabras[i] = cadena.charAt(i);//llenando la palabra en cada iteracion
        }



        Contarletra(palabras,entrada);

    }

    public static void Contarletra(char[] palabra,Scanner entrada){
        char letra;
        int contador=0,x=0;
        String palabr= new String(palabra);//
        
        System.out.print("\nIngrese la letra que quiere buscar en las palabras: ");
        letra = entrada.nextLine().charAt(0);

     
        for (int i = 0; i < palabra.length; i++) {
            if(letra == palabra[i]){
                contador++;
            }
        }
        
            
        System.out.print("La cantidad de letras "+letra+" en la palabra "+palabr +" es:" + contador + " letras");
        

    }

}

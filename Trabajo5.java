


import java.util.Scanner;


public class Trabajo5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nAlumnos;
        
        System.out.println("Ejercicio Libre");
        //aca estoy pidiendo los datos
        do{
        System.out.print("\nIngrese la cantidad de alumnos a registrar en la lista:");
       nAlumnos = entrada.nextInt();
        
       if(nAlumnos < 0){
           System.out.println("\nError esa cantidad es invalida!!\n\n");
       }
       
        }while(nAlumnos < 0);//para que no ingrese una cantidad negativa
        
        String[] nombres = new String[nAlumnos];
        
        for (int i = 0; i < nAlumnos; i++) {
            entrada.nextLine();
            System.out.print("Digite el nombre del alumno: ");
            nombres[i] = entrada.nextLine();
        }
        
        System.out.println("\n\nLa lista de los alumnos es: \n");
        for (int i = 0; i < nAlumnos; i++) {
            System.out.println( (i+1) + ". " + nombres[i] );
        }
    }    
}

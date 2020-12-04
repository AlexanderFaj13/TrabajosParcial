

import java.util.Scanner;

public class Trabajo6 {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        menudeOpciones();
    }

    public static void menudeOpciones(){
        int opcion=0;
        do {
            System.out.println("\n.:MENU:.:");
            System.out.println("1.Convertir unidades de masa");
            System.out.println("2.Convertir unidades de velocidad");
            System.out.println("3.Salir");
            System.out.print("Elija una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                   convertirMasa();
                    break;
                case 2:
                    convertidorVelocidad();
                    break;
                case 3:
         
                    break;
            }

        }while (opcion != 3);
    }

    public static void  convertirMasa(){
        double libras,kilos;
        int seleccion=0;
        
            System.out.println("\n\tOpciones de Conversion");
            System.out.println("1.Convertir de Libras a Kilogramos");
            System.out.println("2.Convertir de Kilogramos a Libras");
            System.out.print("Seleccione una opcion: ");
            seleccion = entrada.nextInt();

           
           
        if (seleccion == 1){
            System.out.print("\nIngrese el peso en lb: ");
            libras = entrada.nextDouble();                            //esto es para redondearlo a 3 cifras
            System.out.println("El peso es  "+kilos(libras) +" kg");


        }else{
            System.out.print("\nIngrese el peso en Kg: ");
            kilos = entrada.nextDouble();
            System.out.println("El peso es: "+tranformarLibras(kilos) + " lbs");
        }


    }

    public static void convertidorVelocidad(){
        double milles,kilometer;
        int seleccion;

       
          System.out.println("\n\tOpciones de Conversion");
        System.out.println("1.Convertir de Millas a Kilometros");
        System.out.println("2.Convertir de Kilometros a Millas");
        System.out.print("Seleccione una opcion: ");
        seleccion = entrada.nextInt();

  
        if (seleccion == 1){
            System.out.print("\nIngrese la velocidad en millas: ");
            milles = entrada.nextDouble();
            System.out.println("La velocidad es : "+km(milles)+" km");


        }else{
            System.out.print("\nIngrese la velocidad en Km: ");
            kilometer= entrada.nextDouble();
            System.out.println("La velocidad es: "+millas(kilometer)+" millas");
        }




    }


    public static double kilos(double lb){
        double kilos = lb/2.205;

       return kilos;
    }

    public static double tranformarLibras(double kg){
        double tranformarLibras = kg * 2.205;

        return tranformarLibras;
    }

    public static double km(double millas){
        double km = millas * 1.609;

        return km;
    }

    public static double millas(double km){
double millas = km / 1.609;

return millas;
    }


}

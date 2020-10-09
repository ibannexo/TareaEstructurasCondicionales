    import java.util.Scanner;
    class EdadMenorNICC {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int edad1;
        int edad2;
        int edad3;

    System.out.print("INGRESE EDAD 1 : ");
    edad1=entrada.nextInt();

    System.out.print("INGRESE EDAD 2 : ");
    edad2=entrada.nextInt();
    System.out.print("INGRESE EDAD 3 : ");
    edad3=entrada.nextInt();
    
   if (edad1<edad2&&edad1<edad3) {
            System.out.println("EL PRIMERA EDAD ES MENOR: " + edad1);
        }
        if (edad2<edad1&&edad2<edad3) {
            System.out.println("LA SEGUNDA EDAD ES MENOR: "+edad2);
        }
        if (edad3<edad1&&edad3<edad2) {
            System.out.println("LA TERCERA EDAD ES MENOR: "+edad3);

        }if (edad1==edad2||edad1==edad3&&edad2==edad3) {
            System.out.println("TODOS TIENEN LA MISMA EDAD: ");
        }
    }
}
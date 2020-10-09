    import java.util.Scanner;
    class regaloPor14deFebreroNICC {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        int cantidad;
        
    System.out.println("TARGETA DE REGALO 10 s/ o menos: ");
    System.out.println("CHOCOLATES 11 a 100  s/");
    System.out.println("FLORES 101 A 250 s/ ");
    System.out.println("ANILLIO mas de 250 s/");

    System.out.print("INGRESE LA CANTIDAD DE DINERO DISPONIBLE : ");
    cantidad=entrada.nextInt();
    
   if (cantidad<=10) {
            System.out.println("Puedes regalar una TARGETA");
        }
        if (cantidad>=11 && cantidad<=100) {
            System.out.println("Puedes regalar CHOCOLATES");
        }
        if (cantidad>=101 && cantidad<=250) {
            System.out.println("Puedes regarlar FLORES");
        }
        if (cantidad>=251) {
            System.out.println("Puedes regalar un ANILLO");
        }
}
}
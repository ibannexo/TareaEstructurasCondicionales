    import java.util.Scanner;
    class paquetePostulaNICC {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        double cantidad;
        
    System.out.println("PAQUETES DESDE 10.000 SOLES HASTA 50:000: ");

    System.out.print("INGRESE LA CANTIDAD DE DINERO DISPONIBLE : ");
    cantidad=entrada.nextDouble();
    
   if (cantidad>=50.000) {
            System.out.println("Usd postua a un paquete de: Un telvisor, un modular , tres pares de zapatos y cinco camisas");
        }
        if (cantidad<= 49.999 && cantidad>=20.000) {
            System.out.println("Usd postua a un paquete de:una grabadora, tres pares de zapatos, cinco camisas y cinco pantalones");
        }
        if (cantidad<19.999 && cantidad>=10.000) {
            System.out.println("Usd postua a un paquete de: un par de zapatos, dos camisas, dos pantalones");
        }
        if (cantidad<9.999) {
            System.out.println("NO puedes comprar ningun paquete");
        }
}
}
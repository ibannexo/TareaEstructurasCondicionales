 import java.util.Scanner;
    class CostoYDescuentoNICC {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        double precio;
        double total;
       

    System.out.print("INGRESE COSTO DEL PRODUCTO : ");
    precio=entrada.nextDouble();

    
   if (precio >=200) {
            total = precio * 0.20;
            total= precio-total;
            System.out.println("PRECIO ES: "+precio+" Y PRECIIO CON EL DESCUENTO: "+total+ " SOLES");
            
        }
         if (precio >= 100 &&precio<200) {
            total = precio *0.15;
            total= precio-total;
            System.out.println("PRECIO ES: "+precio+" Y PRECIIO CON EL DESCUENTO: "+total+ " SOLES");
            
        }
        if (precio<100) {
            
            total = precio * 0.10;
            total= precio-total;
            System.out.println("PRECIO ES: "+precio+" Y PRECIIO CON EL DESCUENTO: "+total+ " SOLES");
        }
}
}
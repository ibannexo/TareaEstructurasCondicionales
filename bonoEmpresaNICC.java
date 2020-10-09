import java.util.Scanner;

public class bonoEmpresaNICC {
 public static void main(String args[]){
  
   Scanner entrada = new Scanner(System.in);
   String nombre;
   int tiempo;
   double sueldo;
   double bono;

   System.out.print("¿Cual es el nombre del trbajador?: ");
   nombre = entrada.nextLine();
   System.out.println("");

   System.out.print("¿Cual es el tiempo de servicio?: ");
   tiempo = entrada.nextInt();
   System.out.println("");

   System.out.print("¿Dé cuanto es su sueldo?: ");
   sueldo = entrada.nextDouble();
   System.out.println("");

   if(sueldo >= 1000 && sueldo <=3500){
        bono = sueldo * 0.15;

     if(tiempo >= 2 && tiempo < 5){
       bono = sueldo * 0.20;

       System.out.println("El trabajador " + nombre + " tiene derecho a " + bono +" soles de bono");
     } else if(tiempo >= 5 ){
       bono = sueldo * 0.30;

       System.out.println("El trabajador " + nombre + " tiene derecho a " + bono +" soles de bono");
     } 

      else {
       System.out.println("El trabajador no cuenta con años de servicio");
     }
    
   } else if(sueldo < 1000){
        bono = sueldo * 0.25;

       if(tiempo >= 2 && tiempo < 5){
       bono = sueldo * 0.20;

       System.out.println("El trabajador " + nombre + " tiene derecho a " + bono +" soles de bono");
     } else if(tiempo >= 5 ){
       bono = sueldo * 0.30;

       System.out.println("El trabajador " + nombre + " tiene derecho a " + bono +" soles de bono");
     }
     }else { 
    System.out.println("Error!, El trabajador no cuenta con los años de servicio necesarios");
    }
  }
}
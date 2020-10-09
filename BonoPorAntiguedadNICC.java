import java.util.Scanner;

public class BonoPorAntiguedadNICC {
 public static void main(String args[]){
  
   Scanner entrada = new Scanner(System.in);
   String nombre;
   int antiguedad;
   
   int bono;

   System.out.print("¿Cual es el nombre del trbajador?: ");
   nombre = entrada.nextLine();
   System.out.println("");

   System.out.print("¿Cual es el tiempo de servicio?: ");
   antiguedad = entrada.nextInt();
   System.out.println("");

  

   if(antiguedad == 1){
     bono=100;

    System.out.println("El trabajador " + nombre + " tiene derecho a " + bono +" soles de bono");

     }if(antiguedad == 2){
       bono=200;

       System.out.println("El trabajador " + nombre + " tiene derecho a " + bono +" soles de bono");
     }  if(antiguedad == 3 ){
       bono=300;

       System.out.println("El trabajador " + nombre + " tiene derecho a " + bono +" soles de bono");
     }   if(antiguedad==4){
       
       bono=400;

       System.out.println("El trabajador " + nombre + " tiene derecho a " + bono +" soles de bono");
     }

       if(antiguedad>=5){
       
       bono=1000;

       System.out.println("El trabajador " + nombre + " tiene derecho a " + bono +" soles de bono");
     }
    
   } 
    
  }

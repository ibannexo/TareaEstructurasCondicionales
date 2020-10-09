import java.util.Scanner;

public class becasNICC {
 public static void main(String args[]){
  
   Scanner entrada = new Scanner(System.in);
   String nombre;
   int edad;
   double promedio;

   System.out.print("¿Cual es el nombre del estudiante?: ");
   nombre = entrada.nextLine();
   System.out.println("");

   System.out.print("¿Cual es la edad del estudiante?: ");
   edad = entrada.nextInt();
   System.out.println("");

   System.out.print("¿Cuanto de promedio tiene el estudiante?: ");
   promedio = entrada.nextDouble();
   System.out.println("");

   if(edad >= 18){

     if(promedio >= 9.0){
       System.out.println("El Estudiante " + nombre + " tiene derecho a 20.00.00 soles de beca");
     } else if(promedio >= 7.5 && promedio < 9.0){
       System.out.println("El Estudiante " + nombre + " tiene derecho a 10.00.00 soles de beca");
     } else if(promedio < 7.5 && promedio >= 6.0){
       System.out.println("El Estudiante " + nombre + " tiene derecho a 5.00.00 soles de beca");
     } else {
       System.out.println("El alumo no cuenta con las notas nesecarias");
     }
    
   } else if(edad <18){
       if(promedio >= 9.0){
       System.out.println("El Estudiante " + nombre + " tiene derecho a 3.000.00 soles de beca");
     } else if(promedio < 9.0 && promedio >= 8.0){
       System.out.println("El Estudiante " + nombre + " tiene derecho a 2.000.00 soles de beca");
     } else if(promedio < 8.0 && promedio >= 6.0){
       System.out.println("El Estudiante " + nombre + " tiene derecho a 1.000.00 soles de beca");
     } else {
       System.out.println("El alumo no cuenta con las notas nesecarias");
     }
     } else { 
      System.out.println("Error!, la edad es incorrecta");
    }
  }
}

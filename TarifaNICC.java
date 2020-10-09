import java.util.Scanner;

public class TarifaNICC{
 public static void main(String args[]){
  
   Scanner entrada = new Scanner(System.in);
        
         int horas;
        int pago;
    System.out.print("HORAS DE SERVISIO: ");
    horas=entrada.nextInt();

     if(horas<=2){
    pago= horas*5;

    }else if(horas == 3){
      pago= horas*4;
      
       } else if(horas >= 4 && horas<=9){
    pago= horas*3;
 
   }  else{
    pago= horas*2;
    
    }
    System.out.println("TOTAL A PAGAR: "+ pago + "SOLES");
 }
}
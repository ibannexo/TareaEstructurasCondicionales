import java.util.Scanner; 
class votoNICC{
    public static void main(String[] argumentos){
        Scanner escaner = new Scanner(System.in);
        int edad;
        System.out.println("Dime tu edad: ");
        edad = escaner.nextInt();
 
 
        if (edad >= 18){
            System.out.println("tienes "+ edad + "años puedes votar");
        }else{
            System.out.println("tienes "+ edad + "años no puedes votar");
        }
    }
}
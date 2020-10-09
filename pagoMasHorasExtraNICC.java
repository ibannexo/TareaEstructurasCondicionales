    import java.util.Scanner;
    class pagoMasHorasExtraNICC {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        int horas;
        int pago;
        int salario;
    System.out.print("Ingrese las horas trabajadas: ");
    horas=entrada.nextInt();
    System.out.print("Ingrese el pago por horas: ");
    pago=entrada.nextInt();

    if(horas<=40){
    salario= horas*pago;
    }
    else{
    salario= (horas-40)*pago*2 + 40*pago;
    
    }
    System.out.println("El salario es de: "+salario);
}

}
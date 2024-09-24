import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("entre com um número; ");
        int numero = sc.nextInt();
        System.out.println();
        
        int sucessor = numero+1;
        int antecessor = numero -1 ;
        String ParImpar = null;
        
        if(numero % 2 == 0 ){
             ParImpar = "PAR";
        }
        else {
            ParImpar = "IMPAR";
        }
        
        System.out.println("seu numero é " + numero);
        System.out.println(sucessor + " é sucessor dele.");
        System.out.println(antecessor + " é antecessor dele.");
        System.out.println(numero + " é " +ParImpar);
    
  }
}

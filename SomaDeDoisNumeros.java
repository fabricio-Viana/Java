import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a,b,s;
      System.out.println("Vamos somar dois números inteiros");
      System.out.print("digite o primeiro número: ");
       a = sc.nextInt();
      System.out.print("digite o segundo número: ");
       b = sc.nextInt();
       s = a + b;
      System.out.println("A soma de " + a + " + " + b + " é igual a " + s);
    
  }


}

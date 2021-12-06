import java.util.Scanner;

public class Exercicio2a {
	public static void 	main(String[] args) {
	
	Scanner teclado=new Scanner (System.in);
	double aria, lado;
	System.out.println("digite o valor do lado");
	lado=teclado.nextDouble();
	aria=lado*lado;
	System.out.println("o valor da aria é: " +aria);	}

}

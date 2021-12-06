import java.util.Scanner;

public class Exercicio2b {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
				double aria, base, altura;
		System.out.println("digite o numero da base");
		base=teclado.nextDouble();
		System.out.println("digite o valor da altura");
		altura=teclado.nextDouble();
		aria=base*altura;
		System.out.println("O valor da aria é: " +aria);
	}

}

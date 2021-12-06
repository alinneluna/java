import java.util.Scanner;

public class Exercicio2c {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		double aria, base, altura;
		System.out.println("digite o número da base");
			base=teclado.nextDouble();
			System.out.println("digite o número da altura");
			altura=teclado.nextDouble();
			aria=base*altura/2;
			System.out.println("O valor da aria é:" +aria);
					}
}

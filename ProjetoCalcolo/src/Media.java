import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		double nota1, nota2, media;
		System.out.println("digitea nota1");
		nota1=teclado.nextDouble();
		System.out.println("digite a nota2");
		nota2=teclado.nextDouble();
		media=(nota1+nota2)/2;
		System.out.println("a média vale:" +media);
		if(media>6) {
			System.out.println("parabens você foi aprovado");
		}
		else {
			System.err.println("você foi reprovado");}		}
		
	}
	 


import java.util.Scanner;

public class media2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		double nota1, nota2, media;
		System.out.println("digita a nota1");
		nota1=teclado.nextDouble();
		System.out.println("digite anota2");
		nota2=teclado.nextDouble();
		media=(nota1+nota2)/2;
		System.out.println("a media vale:" + media);
		if(media>=8 && media<=10) {
			System.out.println("você foi aprovado com ouvor");}
		else if(media >=6&& media<8) {
			System.out.println("você foi aprovado");}
		else if(media >=5&& media<6) 
		{
			System.out.println("você está de recoperação");}
		else
		{
			System.out.println("você foi reprovado");}
		}
}

import java.util.Scanner;

public class Idade {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int anoAtual, anoNascimento, continuar, idade;
		
		
do {
		
		
	System.out.println("digite o ano atual: ");
	anoAtual = ler.nextInt();

	System.out.println("digite o ano de nascimento: ");
	anoNascimento = ler.nextInt();

	idade = anoAtual-anoNascimento;
	
	System.out.println("idade= "+idade);
	System.out.println("deseja continuar?");
	System.out.println("digite 1 para sim e 0 para não");
	continuar = ler.nextInt();

} while (continuar == 1);

	
ler.close();
	
	}



}
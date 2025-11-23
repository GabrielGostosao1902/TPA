import java.util.Scanner;

public class DiasNoMes {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n;
		
		
System.out.println("digite o número correspondente ao mês:");
n = ler.nextInt();

	switch (n) {
	
		case 1:
			System.out.println("janeiro: 31 dias");
		break;
		
		case 2:
			System.out.println("fevereiro: 28 dias");
		break;

		case 3:
			System.out.println("março: 31 dias");
		break;

		case 4:
			System.out.println("abril: 30 dias");
		break;

		case 5:
			System.out.println("maio: 31 dias");
		break;

		case 6:
			System.out.println("junho: 30 dias");
		break;

		case 7:
			System.out.println("julho: 31 dias");
		break;

		case 8:
			System.out.println("agosto: 31 dias");
		break;

		case 9:
			System.out.println("setembro: 30 dias");
		break;

		case 10:
			System.out.println("outubro: 31 dias");
		break;

		case 11:
			System.out.println("novembro: 30 dias");
		break;

		case 12:
			System.out.println("dezembro: 31 dias");
		break;
		
		default:
			System.out.println("número inválido");
	}
	
ler.close();
	
	}


}

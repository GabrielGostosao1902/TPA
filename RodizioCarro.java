import java.util.Scanner;

public class RodizioCarro {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n;
		
		
System.out.println("digite o último número da placa do carro:");
n = ler.nextInt();

System.out.println("você não poderá circular na:");

	switch (n) {
	
		case 1:
		case 2:
			System.out.println("segunda-feira");
		break;
		
		case 3:
		case 4:
			System.out.println("terça-feira");
		break;
		
		case 5:
		case 6:
			System.out.println("quarta-feira");
		break;
		
		case 7:
		case 8:
			System.out.println("quinta-feira");
		break;
		
		case 9:
		case 0:
			System.out.println("sexta-feira");
		break;
		
		default:
			System.out.println("número inválido");
	}
	
	
ler.close();
	
	}

}

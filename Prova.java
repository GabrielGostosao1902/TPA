import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, n4, mi, nm, ex;
		
		System.out.println("digite a 1a nota:");
		n1 = ler.nextDouble();
		
		System.out.println("digite a 2a nota:");
		n2 = ler.nextDouble();
		
		System.out.println("digite a 3a nota:");
		n3 = ler.nextDouble();
		
		System.out.println("digite a 4a nota:");
		n4 = ler.nextDouble();
		
		
	mi = (n1+n2+n3+n4)/4;
				
		System.out.println("sua média é: "+mi);
		
	if(mi<5) {
		System.out.println("reprovado");
	}else if(mi>=7){
		System.out.println("aprovado");
	}else {
		System.out.println("exame");
		
			System.out.println("digite a nota de exame:");
			ex = ler.nextDouble();
		
		nm = (ex+mi)/2;
		
		System.out.println("sua nova média é: "+nm);
		
			if(nm>=7) {
				System.out.println("aprovado após exame");
			}else {
				System.out.println("reprovado após exame");
			}
		
		
		

			
			
			
		
			

ler.close();
		
		}

	}
	
}

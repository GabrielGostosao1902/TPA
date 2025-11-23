import java.util.Scanner;

public class chaos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double altura, peso, media;
		int i, idade, mais50, menor40, idMenor, idMaior;
		
media = 0;
mais50 = 0;
menor40 = 0;
idMenor = 0;
idMaior = 0;
		
for (i=1 ; i<=25 ; i++) {

	System.out.println("digite a idade da "+i+"° pessoa:");
	idade = ler.nextInt();
	
	System.out.println("digite a altura da "+i+"° pessoa:");
	altura = ler.nextDouble();
	
	System.out.println("digite o peso da "+i+"° pessoa:");
	peso = ler.nextDouble();
	
	if (idade >= 50) {
		
		mais50++;
		
	}else if (idade >= 10   &&   idade <= 20) {
		
		media = media+altura;
		
	}
		
	if (peso <=40) {
		
		menor40++;
		
	}
	
	if (idMaior == 0) {
		
		idMaior = idade;
		
	}else if (idade > idMaior) {
		
		idMaior = idade;
		
	}
		
	if (idMenor == 0) {
		
		idMenor = idade;
		
	}else if (idade < idMenor) {
		
		idMenor = idade;
		
	}
		
		
}

media = media/25;

menor40 = (25/100)*menor40;

System.out.println(mais50+"pessoas tem mais de 50 anos");

System.out.println("a media da altura das pessoas que tem entre 10 e 20 anos é igual á: "+media);

System.out.println(menor40+"% das pessoas tem menos de 40 quilos");

System.out.println("a pessoa mais velha tem "+idMaior+" anos");

System.out.println("a pessoa mais nova tem "+idMenor+" anos");


ler.close();

	}

}

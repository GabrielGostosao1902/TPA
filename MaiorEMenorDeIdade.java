import java.util.Scanner;

public class MaiorEMenorDeIdade {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int i = 1, id, maior = 0, menor = 0, pma, pme;

while (i<=5) {
	
	System.out.println("digite a idade do "+i+"º aluno:");
	id = ler.nextInt();
	
	if(id>=18) {
		maior = maior +1;
		System.out.println("maior de idade");
	}else {
		menor = menor +1;
		System.out.println("menor de idade");
	}
	
	i++; // escremento
	
}

	System.out.println(maior+" alunos são maiores de idade.");

		pma = (100/5)*maior;

		System.out.println(pma+"% dos alunos são maiores de idade.");


		System.out.println(menor+" alunos são menores de idade.");

	pme = (100/5)*menor;

		System.out.println(pme+"% dos alunos são menores de idade.");

ler.close();

	}

}
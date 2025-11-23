import java.util.Scanner;

public class Atividade2807 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int id, maior = 0, menor = 0, pma, pme;
		
		
System.out.println("digite a idade do primeiro aluno:");
id = ler.nextInt();
		
if(id>=18) {
	maior = maior +1;
	System.out.println("maior de idade");
}else {
	menor = menor +1;
	System.out.println("menor de idade");
}


System.out.println("digite a idade do segundo aluno:");
id = ler.nextInt();
	
if(id>=18) {
	maior = maior +1;
	System.out.println("maior de idade");
}else {
	menor = menor +1;
	System.out.println("menor de idade");
}


System.out.println("digite a idade do terceiro aluno:");
id = ler.nextInt();
	
if(id>=18) {
	maior = maior +1;
	System.out.println("maior de idade");
}else {
	menor = menor +1;
	System.out.println("menor de idade");
}


System.out.println("digite a idade do quarto aluno:");
id = ler.nextInt();
	
if(id>=18) {
	maior = maior +1;
	System.out.println("maior de idade");
}else {
	menor = menor +1;
	System.out.println("menor de idade");
}


System.out.println("digite a idade do quinto aluno:");
id = ler.nextInt();
	
if(id>=18) {
	maior = maior +1;
	System.out.println("maior de idade");
}else {
	menor = menor +1;
	System.out.println("menor de idade");
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
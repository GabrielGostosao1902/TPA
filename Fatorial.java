import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
	
			Scanner ler = new Scanner(System.in);
			int i, n, f;
		
System.out.println("digite o valor: ");
n = ler.nextInt();
		
	i = n; // inicializar o contador
	f = n;
		
if (n!=0) {
		
	do {
		
		f = f*(i-1);
		i--; // descrementar o contador
		
	} while (i>1);
	
	System.out.println("!"+n+"= "+f);
	
}else{
	
	System.out.println("!0= 1");
	
}		
	
ler.close();

	}

}
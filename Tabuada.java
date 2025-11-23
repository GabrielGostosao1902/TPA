import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i = 1;
		double v, n;
		
System.out.println("digite o valor da tabuada");
v = ler.nextDouble();
		
	while (i<=10) {
		
		n = v*i;
		System.out.println(v+"x"+i+"= "+n);
		
		i++; // escremento
	} 
		
	
ler.close();	

	}
	
}

import java.util.Scanner;

public class AnosBissextos {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int i, anoInicial, anoFinal, anoBissexto;
		
		
System.out.println("digite o ano inicial: ");
anoInicial = ler.nextInt();

System.out.println("digite o ano final: ");
anoFinal = ler.nextInt();

i = anoInicial;
anoBissexto = 0;

while (i <= anoFinal){
	if (i % 100 != 0){
		if (i % 4 == 0){
		
			anoBissexto++;
			System.out.println(i+"= é um ano bissexto");
		
		} else {
		
			System.out.println(i+"= não é um ano bissexto");
			
		}
		
	} else {
		
		if (i % 400 == 0){
		
			anoBissexto++;
			System.out.println(i+"= é um ano bissexto");
		
		} else {
		
			System.out.println(i+"= não é um ano bissexto");
			
		}
		
	} i++;
	
}

System.out.println(anoBissexto+" anos são bissextos");
	
ler.close();
	
	}



}

public class Somatoria0a400 {
	
public static void main(String[] args) {
		
		int i, somatoria;
		
somatoria = 0;

for (i=0 ; i<=400 ; i++){
	
	if (i % 5 == 0) {
		
		somatoria = i+somatoria;
		
	}
	
}
	
System.out.println("a somatória dos números múltiplos de 5 de 0 a 400 é igual à: "+somatoria);
	
	}



}
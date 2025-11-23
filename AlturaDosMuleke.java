public class AlturaDosMuleke {
	
	public static void main(String[] args) {
		
		double HJ, HP;
		int i;
	
i = 1; // inicializar o contador
HJ = 134;
HP = 145;
	
do {
	
	HJ = HJ+2.5;
	HP = HP+2;
	
	i++;

} while (HP>=HJ);

	System.out.println(i+" anos");

}

}

import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos N: ");
        int N = sc.nextInt();

        int a = 1, b = 1, contador = 1;

        do {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
            contador++;
        } while (contador <= N);

        sc.close(); 

}
}

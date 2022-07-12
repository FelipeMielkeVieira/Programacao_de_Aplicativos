import java.util.Scanner;

public class ex_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		System.out.println("Divisão: " + (numero / 3));
		
		sc.close();
	}
}

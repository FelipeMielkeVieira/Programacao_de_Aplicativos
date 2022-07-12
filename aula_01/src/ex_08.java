import java.util.Scanner;

public class ex_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Digite outro número: ");
		int numero2 = sc.nextInt();
		
		System.out.println("Soma: " + (numero1 + numero2));
		
		sc.close();
	}
}

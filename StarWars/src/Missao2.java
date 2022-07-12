import java.util.Scanner;

public class Missao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, soma = 0;
		do {
			
			System.out.print("X: ");
			x = sc.nextInt();
			
			soma += x;
			
		} while(x != 0);
		
		System.out.println("Soma: " + soma);
		
		sc.close();
	}
}

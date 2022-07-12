import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu nome? ");
		String nome = sc.next();
		
		System.out.println("Seu nome é " + nome);
		
		sc.close();
	}
}

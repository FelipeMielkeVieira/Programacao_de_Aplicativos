import java.util.Scanner;

public class Missao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		do {
			
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();
			
			if(senha != 4531) {
				System.out.println("Acesso Negado!");
			}
			
		} while(senha != 4531);
		
		System.out.println("Acesso Permitido!");
		
		sc.close();
	}
}

import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			
			System.out.print("Número: ");
			num = sc.nextInt();
			
			int contagem = 1, contagemPrimo = 0;
			do {
				
				if(num % contagem == 0) {
					contagemPrimo++;
				}
				
				contagem++;
			} while (contagem < num);
			
			if(contagemPrimo > 1) {
				System.out.println("O número não é primo!");
			} else {
				System.out.println("O número é primo!");
			}
			
		} while (num > 1);
		
		sc.close();
	}
}

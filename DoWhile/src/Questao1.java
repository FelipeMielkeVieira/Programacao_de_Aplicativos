import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		do {
			
			System.out.print("N�mero: ");
			num = sc.nextInt();
			
			int contagem = 1, contagemPrimo = 0;
			do {
				
				if(num % contagem == 0) {
					contagemPrimo++;
				}
				
				contagem++;
			} while (contagem < num);
			
			if(contagemPrimo > 1) {
				System.out.println("O n�mero n�o � primo!");
			} else {
				System.out.println("O n�mero � primo!");
			}
			
		} while (num > 1);
		
		sc.close();
	}
}

import java.util.Scanner;

public class QuestaoA {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		num2 = sc.nextInt();
		
		System.out.println("Subtra��o dos n�meros = " + (num1 - num2));
		
		sc.close();
	}
}

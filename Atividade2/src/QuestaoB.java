import java.util.Scanner;

public class QuestaoB {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		num2 = sc.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		num3 = sc.nextInt();
		
		System.out.println("Multiplica��o dos n�meros = " + (num1 * num2 * num3));
		
		sc.close();
	}
}

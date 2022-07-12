import java.util.Scanner;

public class QuestaoB {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		num3 = sc.nextInt();
		
		System.out.println("Multiplicação dos números = " + (num1 * num2 * num3));
		
		sc.close();
	}
}

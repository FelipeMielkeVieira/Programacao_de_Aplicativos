import java.util.Scanner;

public class QuestaoN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double peso, quantidade;
		
		System.out.print("Peso do saco (em quilos): ");
		peso = sc.nextDouble();
		
		System.out.print("Quantidade de ração fornecida para cada gato (em gramas): ");
		quantidade = sc.nextDouble();
		
		System.out.println("Quantidade de ração no saco após 5 dias: " + (peso - (2 * quantidade * 0.001 * 5)) + " kg");
		
		sc.close();
	}
}

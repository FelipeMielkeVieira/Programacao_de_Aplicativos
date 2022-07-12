import java.util.Scanner;

public class QuestaoJ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double reais;
		
		System.out.print("Qual o valor em reais? ");
		reais = sc.nextDouble();
		
		System.out.println("Conversão \n" +
				"Dólares: " + (reais / 4.97) +
				"\nEuros: " + (reais / 5.23) +
				"\nLibras Esterlinas: " + (reais / 6.25));
		
		sc.close();
	}
}

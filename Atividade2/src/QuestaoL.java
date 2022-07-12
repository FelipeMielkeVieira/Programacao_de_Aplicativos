import java.util.Scanner;

public class QuestaoL {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double custo, ingresso;
		
		System.out.print("Custo do espetáculo: ");
		custo = sc.nextDouble();
		
		System.out.print("Valor do ingresso: ");
		ingresso = sc.nextDouble();
		
		System.out.println("Quantidade de ingressos necessária para que o custo seja alcançado: " + (custo / ingresso));
		
		sc.close();
	}
}

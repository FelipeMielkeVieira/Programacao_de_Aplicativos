import java.util.Scanner;

public class QuestaoD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco;
		
		System.out.print("Qual o preço do produto? ");
		preco = sc.nextDouble();
		
		System.out.println("Preço Final: " + (preco * 0.9));
		
		sc.close();
	}
}

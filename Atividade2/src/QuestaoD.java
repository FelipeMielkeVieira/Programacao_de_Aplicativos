import java.util.Scanner;

public class QuestaoD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco;
		
		System.out.print("Qual o pre�o do produto? ");
		preco = sc.nextDouble();
		
		System.out.println("Pre�o Final: " + (preco * 0.9));
		
		sc.close();
	}
}

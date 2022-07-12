import java.util.Scanner;

public class QuestaoE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario, vendas;
		
		System.out.print("Qual o salário inicial? ");
		salario = sc.nextDouble();
		
		System.out.print("Qual o valor das vendas? ");
		vendas = sc.nextDouble();
		
		System.out.println("Comissão: " + (vendas * 0.04));
		System.out.println("Salário Final: " + (salario + (vendas * 0.04)));
		
		sc.close();
	}
}

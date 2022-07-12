import java.util.Scanner;

public class QuestaoF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salarioMinimo, salario;
		
		System.out.print("Qual o salário mínimo? ");
		salarioMinimo = sc.nextDouble();
		
		System.out.print("Qual o salário do funcionário? ");
		salario = sc.nextDouble();
		
		System.out.println("Seu salário equivale à " + (salario / salarioMinimo) + " salários mínimos");
		
		sc.close();
	}
}

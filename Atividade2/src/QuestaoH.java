import java.util.Scanner;

public class QuestaoH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario, conta1, conta2, restante;
		
		System.out.print("Qual o salário? ");
		salario = sc.nextDouble();
		
		System.out.print("Qual o valor da primeira conta? ");
		conta1 = sc.nextDouble();
		
		System.out.print("Qual o valor da seguda conta? ");
		conta2 = sc.nextDouble();
		
		restante = salario - (conta1 * 1.02) - (conta2 * 1.02);
		System.out.println("R$ " + restante + " restarão do salário!");
		
		sc.close();
	}
}

import java.util.Scanner;

public class QuestaoF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salarioMinimo, salario;
		
		System.out.print("Qual o sal�rio m�nimo? ");
		salarioMinimo = sc.nextDouble();
		
		System.out.print("Qual o sal�rio do funcion�rio? ");
		salario = sc.nextDouble();
		
		System.out.println("Seu sal�rio equivale � " + (salario / salarioMinimo) + " sal�rios m�nimos");
		
		sc.close();
	}
}

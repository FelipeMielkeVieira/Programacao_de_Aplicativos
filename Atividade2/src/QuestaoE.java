import java.util.Scanner;

public class QuestaoE {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario, vendas;
		
		System.out.print("Qual o sal�rio inicial? ");
		salario = sc.nextDouble();
		
		System.out.print("Qual o valor das vendas? ");
		vendas = sc.nextDouble();
		
		System.out.println("Comiss�o: " + (vendas * 0.04));
		System.out.println("Sal�rio Final: " + (salario + (vendas * 0.04)));
		
		sc.close();
	}
}

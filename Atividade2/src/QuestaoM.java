import java.util.Scanner;

public class QuestaoM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salarioMinimo, quilowatts;
		
		System.out.print("Qual o salário mínimo? ");
		salarioMinimo = sc.nextDouble();
		
		System.out.print("Qual a quantidade consumida de quilowatts? ");
		quilowatts = sc.nextDouble();
		
		System.out.println("Valor do Quilowatt: R$ " + (salarioMinimo / 5)
				+ "\nValor Total: R$ " + (salarioMinimo / 5 * quilowatts)
				+ "\nValor Descontado: R$ " + (salarioMinimo / 5 * quilowatts * 0.85));
		
		sc.close();
	}
}

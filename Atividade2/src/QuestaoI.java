import java.util.Scanner;

public class QuestaoI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horas, horasExtras;
		double salarioMinimo, bruto, liquido;
		
		System.out.print("Quais as horas trabalhadas? ");
		horas = sc.nextInt();
		
		System.out.print("Quais as horas extras trabalhadas? ");
		horasExtras = sc.nextInt();
		
		System.out.print("Qual o salário mínimo? ");
		salarioMinimo = sc.nextDouble();
		
		bruto = (salarioMinimo / 8) * horas;
		liquido = bruto + (horasExtras * (salarioMinimo / 4));
		System.out.println("Salário Final = " + liquido);
		
		sc.close();
	}
}

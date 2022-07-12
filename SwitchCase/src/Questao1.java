import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double aumento = 0, salarioFinal;
		
		System.out.print("Código do Cargo: ");
		int codigo = sc.nextInt();
		
		System.out.print("Salário Atual: ");
		double salario = sc.nextDouble();
		
		switch(codigo) {
		case 1:
			System.out.println("Cargo: Escrituário");
			aumento = salario * 0.5;
			break;
		case 2:
			System.out.println("Cargo: Secretário");
			aumento = salario * 0.35;
			break;
		case 3:
			System.out.println("Caixa");
			aumento = salario * 0.2;
			break;
		case 4:
			System.out.println("Gerente");
			aumento = salario * 0.1;
			break;
		case 5:
			System.out.println("Diretor");
			aumento = 0;
			break;
		}
		
		salarioFinal = salario + aumento;
		System.out.println("Aumento: R$ " + aumento);
		System.out.println("Salário Final: R$ " + salarioFinal);
		
		sc.close();
	}
}

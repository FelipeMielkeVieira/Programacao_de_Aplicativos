import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double aumento = 0, salarioFinal;
		
		System.out.print("C�digo do Cargo: ");
		int codigo = sc.nextInt();
		
		System.out.print("Sal�rio Atual: ");
		double salario = sc.nextDouble();
		
		switch(codigo) {
		case 1:
			System.out.println("Cargo: Escritu�rio");
			aumento = salario * 0.5;
			break;
		case 2:
			System.out.println("Cargo: Secret�rio");
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
		System.out.println("Sal�rio Final: R$ " + salarioFinal);
		
		sc.close();
	}
}

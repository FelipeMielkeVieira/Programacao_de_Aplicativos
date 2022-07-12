import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double aumento, salarioFinal;
		
		System.out.print("Código do cargo: ");
		int codigo = sc.nextInt();
		
		System.out.print("Salário Atual: ");
		double salarioAtual = sc.nextDouble();
		
		if(codigo == 1) {
			System.out.println("Cargo: Escrituário");
			aumento = 1.5;
		} else if (codigo == 2) {
			System.out.println("Cargo: Secretário");
			aumento = 1.35;
		} else if (codigo == 3) {
			System.out.println("Cargo: Caixa");
			aumento = 1.2;
		} else if (codigo == 4) {
			System.out.println("Cargo: Gerente");
			aumento = 1.1;
		} else {
			System.out.println("Cargo: Diretor");
			aumento = 1;
		}
		
		salarioFinal = salarioAtual * aumento;
		System.out.println("Aumento: R$ " + aumento);
		System.out.println("Salário Final: R$ " + salarioFinal);
		
		sc.close();
	}
}

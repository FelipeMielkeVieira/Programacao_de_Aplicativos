import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salarioAtual;
		
		System.out.println("----- Menu -----\n1 - Imposto \n2 - Novo Salário \n3 - Classificação");
		int opcao = sc.nextInt();
		
		System.out.print("Salário Atual: ");
		salarioAtual = sc.nextDouble();
		
		if(opcao == 1) {
			
			double imposto = 0;
			if(salarioAtual < 500) {
				imposto = 0.05;
			} else if (salarioAtual <= 850) {
				imposto = 0.1;
			} else {
				imposto = 0.15;
			}
			
			System.out.println("Valor do Imposto: R$ " + (salarioAtual * imposto));
			
		} else if (opcao == 2) {
			
			double novoSalario;
			if(salarioAtual > 1500) {
				novoSalario = salarioAtual + 25;
			} else if (salarioAtual >= 750) {
				novoSalario = salarioAtual + 50;
			} else if (salarioAtual >= 450) {
				novoSalario = salarioAtual + 75;
			} else {
				novoSalario = salarioAtual + 100;
			}
			
			System.out.println("Novo Salário: R$ " + novoSalario);
			
		} else if (opcao == 3) {
			
			if(salarioAtual <= 700) {
				System.out.println("Classificação: Mal Remunerado!");
			} else {
				System.out.println("Classificação: Bem Remunerado!");
			}
			
		} else {
			System.out.println("Operação Inválida!");
		}
		
		sc.close();
	}
}

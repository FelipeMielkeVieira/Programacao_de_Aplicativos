import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário Mínimo: ");
		double salarioMinimo = sc.nextDouble();
		
		double quilowatt = salarioMinimo / 8;
		double faturamento = 0;
		int contagem = 1, qtdConsumidores = 0;
		
		System.out.println("Valor do Quilowatt: R$ " + quilowatt);
		
		System.out.print("Consumidor 1 \nQuantidade de Quilowatts: ");
		double qtd = sc.nextDouble();
		
		while(qtd > 0) {
			System.out.println("Tipo de Consumidor: \n1 - Residencial \n2 - Comercial \n3 - Industrial");
			int tipo = sc.nextInt();
			
			double valor = qtd * quilowatt;
			switch(tipo) {
			case 1:
				valor *= 1.05;
				break;
			case 2:
				valor *= 1.1;
				break;
			case 3:
				valor *= 1.15;
				break;
			}
			
			if(valor >= 500 && valor <= 1000) {
				qtdConsumidores++;
			}
			faturamento += valor;
			
			System.out.println("Valor a Pagar: R$ " + valor);
			
			contagem++;
			System.out.print("Consumidor " + contagem + " \nQuantidade de Quilowatts: ");
			qtd = sc.nextDouble();
		}
		
		System.out.println("Faturamento Geral da Empresa: R$ " + faturamento + 
				"\nQuantidade de consumidores que pagam entre R$500,00 e R$1.000,00: " + qtdConsumidores);
		
		sc.close();
	}
}

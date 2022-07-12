import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double totalFabrica = 0, mediaHomens, mediaMulheres, maiorSalario = 0;
		int totalPecas = 0, numMaiorSalario = 0, homens = 0, mulheres = 0, somaHomens = 0, somaMulheres = 0;
		
		System.out.print("Salário Mínimo: ");
		double minimo = sc.nextDouble();
		
		for(int i = 0; i < 15; i++) {
			System.out.println("Trabalhador " + (i + 1) + ":");
			
			System.out.print("Número: ");
			int num = sc.nextInt();
			
			System.out.print("Peças fabricadas no mês: ");
			int pecas = sc.nextInt();
			
			System.out.print("Sexo: (M / F) ");
			String sexo = sc.next();
			
			double salario ;
			if(pecas <= 30) {
				salario = minimo;
			} else if (pecas <= 50) {
				salario = minimo + (minimo * 0.03 * (pecas - 30));
			} else {
				salario = minimo + (minimo * 0.05 * (pecas - 30));
			}
			
			totalFabrica += salario;
			totalPecas += pecas;
			
			if(maiorSalario == 0) {
				maiorSalario = salario;
				numMaiorSalario = num;
			}
			if(salario > maiorSalario) {
				maiorSalario = salario;
				numMaiorSalario = num;
			}
			
			if(sexo.equals("M")) {
				homens++;
				somaHomens += pecas;
			} else {
				mulheres++;
				somaMulheres += pecas;
			}
		 	
			System.out.println("Número: " + num + "\nSalário: " + salario);
		}
		
		mediaHomens = somaHomens / homens;
		mediaMulheres = somaMulheres / mulheres;
		
		System.out.println("Total da folha de pagamento: R$ " + totalFabrica +
				"\nTotal de Peças: " + totalPecas +
				"\nMédia de Peças:"
				+ "\nHomens: " + mediaHomens
				+ "\nMulheres: " + mediaMulheres
				+ "\nNúmero do Operário de Maior Salário: " + numMaiorSalario);
		
		sc.close();
	}
}

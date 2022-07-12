import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numCidade = 1, maiorAcidente = 0, cidadeMaiorAcidente = 0, menorAcidente = 0, cidadeMenorAcidente = 0,
				somaVeiculos = 0, somaAcidentes = 0, qtdMenos2000 = 0;
		double mediaVeiculos, mediaAcidentes;
		do {

			System.out.print("C�digo: ");
			int codigo = sc.nextInt();

			System.out.print("Ve�culos de Passeio: ");
			int passeio = sc.nextInt();

			System.out.print("Acidentes em tr�nsito: ");
			int acidentes = sc.nextInt();

			if (numCidade == 1) {
				maiorAcidente = acidentes;
				cidadeMaiorAcidente = codigo;
				menorAcidente = acidentes;
				cidadeMenorAcidente = codigo;
			}
			if (acidentes > maiorAcidente) {
				maiorAcidente = acidentes;
				cidadeMaiorAcidente = codigo;
			}
			if (acidentes < menorAcidente) {
				menorAcidente = acidentes;
				cidadeMenorAcidente = codigo;
			}

			somaVeiculos += passeio;
			if (passeio < 2000) {
				qtdMenos2000++;
				somaAcidentes += acidentes;
			}

			numCidade++;
		} while (numCidade <= 5);

		mediaVeiculos = somaVeiculos / 5;
		mediaAcidentes = somaAcidentes / qtdMenos2000;

		System.out.println("Maior N�mero de Acidentes: " + maiorAcidente + " / " + cidadeMaiorAcidente
				+ "\nMenor N�mero de Acidentes: " + menorAcidente + " / " + cidadeMenorAcidente
				+ "\nM�dia de Ve�culos: " + mediaVeiculos
				+ "\nM�dia de acidentes nas cidades com menos de 2.000 ve�culos: " + mediaAcidentes);

		sc.close();
	}
}

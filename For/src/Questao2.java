import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade18 = 0, contagem80 = 0;
		double media1 = 0, media2 = 0, somaAltura = 0, mediaAltura = 0;

		System.out.println("Time 1:");
		for (int i = 0; i < 11; i++) {
			System.out.print("Jogador " + (i + 1));

			System.out.print("Idade: ");
			int idade = sc.nextInt();

			System.out.print("Peso: ");
			double peso = sc.nextDouble();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			if (idade < 18) {
				idade18++;
			}

			if (peso > 80) {
				contagem80++;
			}

			media1 = (media1 + idade) / (i + 1);

			somaAltura += altura;
		}

		System.out.println("Time 2:");
		for (int i = 0; i < 11; i++) {
			System.out.print("Jogador " + (i + 1));

			System.out.print("Idade: ");
			int idade = sc.nextInt();

			System.out.print("Peso: ");
			double peso = sc.nextDouble();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			if (idade < 18) {
				idade18++;
			}

			if (peso > 80) {
				contagem80++;
			}

			media2 = (media2 + idade) / (i + 1);

			somaAltura += altura;
		}

		mediaAltura = somaAltura / 22;

		System.out.println("Jogadores com menos de 18 anos: " + idade18 + "\nMédia de Idades: \nTime 1: " + media1
				+ "\nTime 2: " + media2 + "\nMédia de Alturas Total: " + mediaAltura
				+ "\nPorcentagem dos jogadores com mais de 80kg: " + (contagem80 * 100 / 22));

		sc.close();
	}

}

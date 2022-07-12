package AtividadeCondicionais;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nota do trabalho de laboratório: ");
		double nota1 = sc.nextDouble();
		System.out.print("Nota da avaliação semestral: ");
		double nota2 = sc.nextDouble();
		System.out.print("Nota do exame final: ");
		double nota3 = sc.nextDouble();

		double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		System.out.println("\nMédia Ponderada: " + media);
		
		if (media >= 8) {
			System.out.println("Conceito: A");
		}
		if (media >= 7 && media < 8) {
			System.out.println("Conceito: B");
		}
		if (media >= 6 && media < 7) {
			System.out.println("Conceito: C");
		}
		if (media >= 5 && media < 6) {
			System.out.println("Conceito: D");
		}
		if(media < 5) {
			System.out.println("Conceito: E");
		}

		sc.close();
	}
}

package AtividadeCondicionais;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		double nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("\nMédia: " + media);
		
		if(media < 3) {
			System.out.println("Reprovado!");
		}
		if (media < 7 && media >= 3) {
			System.out.println("Em Exame!");
			System.out.println("Você precisa de " + (6 - media) + " pontos para ser aprovado!");
		}
		if(media >= 7) {
			System.out.println("Aprovado!");
		}
		
		sc.close();
	}
}

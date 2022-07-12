package atividade_02;

import java.util.Scanner;

public class ex_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero1 = sc.nextInt();

		System.out.print("Digite outro número: ");
		int numero2 = sc.nextInt();

		System.out.println("Média: " + (numero1 + numero2) / 2);

		sc.close();
	}
}

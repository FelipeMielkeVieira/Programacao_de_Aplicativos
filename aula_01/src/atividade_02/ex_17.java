package atividade_02;

import java.util.Scanner;

public class ex_17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Raio: ");
		double raio = sc.nextDouble();

		System.out.println("Per�metro: " + (raio * 2 * 3.14));
		System.out.println("�rea: " + (3.14 * raio * raio));

		sc.close();
	}
}

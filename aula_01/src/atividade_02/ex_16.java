package atividade_02;

import java.util.Scanner;

public class ex_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Base: ");
		double base = sc.nextDouble();

		System.out.print("Altura: ");
		double altura = sc.nextDouble();

		System.out.println("�rea: " + (base * altura));
		System.out.println("Per�metro: " + (base + base + altura + altura));

		sc.close();
	}
}

package atividade_02;

import java.util.Scanner;

public class ex_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Base: ");
		double base = sc.nextDouble();

		System.out.print("Altura: ");
		double altura = sc.nextDouble();

		System.out.println("�rea: " + (base * altura / 2));

		sc.close();
	}
}

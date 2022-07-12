package atividade_02;

import java.util.Scanner;

public class ex_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double media1 = (8 + 9 + 7) / 3;
		System.out.println("Média (8, 9 e 7): " + media1);
		
		double media2 = (4 + 5 + 6) / 3;
		System.out.println("Média (4, 5 e 6): " + media2);
		
		System.out.println("Soma das médias: " + (media1 + media2));
		System.out.println("Média das médias: " + (media1 + media2) / 2);

		sc.close();
	}
}

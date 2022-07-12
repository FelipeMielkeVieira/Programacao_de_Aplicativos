package atividade_02;

import java.util.Scanner;

public class ex_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Anos: ");
		int anos = sc.nextInt();
		
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		System.out.print("Dias: ");
		int dias = sc.nextInt();
		
		System.out.println("Idade em dias: " + ((anos * 365) + (meses * 30) + dias));
		
		sc.close();
	}
}

package atividade_02;

import java.util.Scanner;

public class ex_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Idade: " + idade);
		
		sc.close();
	}
}

package atividade_02;

import java.util.Scanner;

public class ex_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
	
		System.out.print("Endereço: ");
		String endereco = sc.nextLine();
		
		System.out.print("Telefone: ");
		String telefone = sc.next();
		
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
		
		sc.close();
	}
}

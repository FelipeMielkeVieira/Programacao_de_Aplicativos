package atividade_02;

import java.util.Scanner;

public class ex_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
	
		System.out.print("Endere�o: ");
		String endereco = sc.nextLine();
		
		System.out.print("Telefone: ");
		String telefone = sc.next();
		
		System.out.println("Nome: " + nome);
		System.out.println("Endere�o: " + endereco);
		System.out.println("Telefone: " + telefone);
		
		sc.close();
	}
}

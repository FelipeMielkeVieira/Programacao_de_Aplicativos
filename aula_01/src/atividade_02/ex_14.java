package atividade_02;

import java.util.Scanner;

public class ex_14 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = sc.nextInt();
		
		System.out.println("Divis�o: " + (numero / 3));
		
		sc.close();
	}
}

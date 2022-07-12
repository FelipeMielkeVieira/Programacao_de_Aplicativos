package AtividadeCondicionais;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número 1: ");
		double num1 = sc.nextDouble();
		System.out.print("Número 2: ");
		double num2 = sc.nextDouble();
		
		if(num1 > num2) {
			System.out.println("Maior: " + num1);
		}
		if (num2 > num1) {
			System.out.println("Maior: " + num2);
		}
		if(num1 == num2) {
			System.out.println("Os números são iguais!");
		}
		
		sc.close();
	}
}

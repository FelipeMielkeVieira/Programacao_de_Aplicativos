package AtividadeCondicionais;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número 1: ");
		double num1 = sc.nextDouble();
		System.out.print("Número 2: ");
		double num2 = sc.nextDouble();
		System.out.print("Número 3: ");
		double num3 = sc.nextDouble();
		System.out.print("Número 4: ");
		double num4 = sc.nextDouble();
		
		if(num4 > num3) {
			System.out.println("Ordem Decrescente: \n" + num4 + "\n" + num3 + "\n" + num2 + "\n" + num1);
		}
		if (num4 > num2) {
			System.out.println("Ordem Decrescente: \n" + num3 + "\n" + num4 + "\n" + num2 + "\n" + num1);
		}
		if (num4 > num1) {
			System.out.println("Ordem Decrescente: \n" + num3 + "\n" + num2 + "\n" + num4 + "\n" + num1);
		}
		if(num4 < num1) {
			System.out.println("Ordem Decrescente: \n" + num3 + "\n" + num2 + "\n" + num1 + "\n" + num4);
		}
		
		sc.close();
	}
}

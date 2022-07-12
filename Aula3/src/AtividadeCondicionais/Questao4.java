package AtividadeCondicionais;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número 1: ");
		double num1 = sc.nextDouble();
		System.out.print("Número 2: ");
		double num2 = sc.nextDouble();
		System.out.print("Número 3: ");
		double num3 = sc.nextDouble();
		
		if(num1 > num2 && num1 > num3) {
			if(num2 > num3) {
				System.out.println("Ordem Crescente: \n" + num3 + "\n" + num2 + "\n" + num1);
			}
			if(num3 > num2) {
				System.out.println("Ordem Crescente: \n" + num2 + "\n" + num3 + "\n" + num1);
			}
		}
		if (num2 > num1 && num2 > num3) {
			if(num1 > num3) {
				System.out.println("Ordem Crescente: \n" + num3 + "\n" + num1 + "\n" + num2);
			}
			if(num3 > num2) {
				System.out.println("Ordem Crescente: \n" + num1 + "\n" + num3 + "\n" + num2);
			}
		}
		if(num3 > num1 && num3 > num2) {
			if(num2 > num1) {
				System.out.println("Ordem Crescente: \n" + num1 + "\n" + num2 + "\n" + num3);
			}
			if(num1 > num2) {
				System.out.println("Ordem Crescente: \n" + num2 + "\n" + num1 + "\n" + num3);
			}
		}
		
		sc.close();
	}
}

package AtividadeCondicionais;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor I: ");
		int i = sc.nextInt();
		System.out.print("Digite o valor A: ");
		double a = sc.nextDouble();
		System.out.print("Digite o valor B: ");
		double b = sc.nextDouble();
		System.out.print("Digite o valor C: ");
		double c = sc.nextDouble();
		
		if(i == 1) {
			System.out.println("Ordem Crescente:");
			if(a < b && a < c) {
				if(b < c) {
					System.out.println(a + "\n" + b + "\n" + c);
				}
				if(c < b) {
					System.out.println(a + "\n" + c + "\n" + b);
				}
			}
			if(b < a && b < c) {
				if(a < c) {
					System.out.println(b + "\n" + a + "\n" + c);
				}
				if(c < a) {
					System.out.println(b + "\n" + c + "\n" + a);
				}
			}
			if(c < a && c < b) {
				if(b < a) {
					System.out.println(c + "\n" + b + "\n" + a);
				}
				if(a < b) {
					System.out.println(c + "\n" + a + "\n" + b);
				}
			}
		}
		
		if(i == 2) {
			System.out.println("Ordem Decrescente:");
			if(a > b && a > c) {
				if(b > c) {
					System.out.println(a + "\n" + b + "\n" + c);
				}
				if(c > b) {
					System.out.println(a + "\n" + c + "\n" + b);
				}
			}
			if(b > a && b > c) {
				if(a > c) {
					System.out.println(b + "\n" + a + "\n" + c);
				}
				if(c > a) {
					System.out.println(b + "\n" + c + "\n" + a);
				}
			}
			if(c > a && c > b) {
				if(b > a) {
					System.out.println(c + "\n" + b + "\n" + a);
				}
				if(a > b) {
					System.out.println(c + "\n" + a + "\n" + b);
				}
			}
		}
		
		if(i == 3) {
			System.out.println("Maior número no meio: ");
			if(a > b && a > c) {
				System.out.println(b + "\n" + a + "\n" + c);
			}
			if(b > a && b > c) {
				System.out.println(a + "\n" + b + "\n" + c);
			}
			if(c > a && c > b) {
				System.out.println(a + "\n" + c + "\n" + b);
			}
		}
		
		sc.close();
	}
}

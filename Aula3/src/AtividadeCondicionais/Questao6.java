package AtividadeCondicionais;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O n�mero � par!");
		}
		if(num % 2 != 0) {
			System.out.println("O n�mero � �mpar!");
		}
		
		sc.close();
	}
}

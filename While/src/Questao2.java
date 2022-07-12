import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número: ");
		double num = sc.nextDouble();
		
		while(num > 0) {
			System.out.println("Valor: " + num +
					"\nQuadrado: " + Math.pow(num, 2) +
					"\nCubo: " + Math.pow(num, 3) +
					"\nRaiz Quadrada: " + Math.sqrt(num));
			
			System.out.print("Número: ");
			num = sc.nextDouble();
		}
		
		sc.close();
	}
}

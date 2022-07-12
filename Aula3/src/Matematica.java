import java.util.Scanner;

public class Matematica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double num = sc.nextDouble();
		
		System.out.println("Número ao quadrado = " + Math.pow(num, 2));
		System.out.println("Número ao cubo = " + Math.pow(num, 3));
		System.out.println("Raiz Quadrada = " + Math.sqrt(num));
		System.out.println("Raiz Cúbica = " + Math.cbrt(num));
		
		sc.close();
	}
}

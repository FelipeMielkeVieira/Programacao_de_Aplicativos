import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o 'a' da função? ");
		double a = sc.nextDouble();
		System.out.print("Qual o 'b' da função? ");
		double b = sc.nextDouble();
		System.out.print("Qual o 'c' da função? ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("As raízes da função são " + x1 + " e " + x2);
		
		sc.close();
	}
}

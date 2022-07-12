import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o 'a' da fun��o? ");
		double a = sc.nextDouble();
		System.out.print("Qual o 'b' da fun��o? ");
		double b = sc.nextDouble();
		System.out.print("Qual o 'c' da fun��o? ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("As ra�zes da fun��o s�o " + x1 + " e " + x2);
		
		sc.close();
	}
}

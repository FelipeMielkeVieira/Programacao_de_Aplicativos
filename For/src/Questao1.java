import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Número: ");
		double num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}

		sc.close();
	}
}

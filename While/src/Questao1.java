import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Sal�rio do Carlos: ");
		double salarioCarlos = sc.nextDouble();

		double salarioJoao = salarioCarlos / 3;
		int meses = 0;

		while (salarioJoao < salarioCarlos) {
			salarioJoao *= 1.05;
			salarioCarlos *= 1.02;
			meses++;
		}

		System.out.println(
				"Quantidade de meses necess�rios para que o valor pertencente a Jo�o iguale ou ultrapasse o valor pertencente a Carlos: "
						+ meses);

		sc.close();
	}
}

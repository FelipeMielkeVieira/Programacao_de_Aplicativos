import java.util.Scanner;

public class ex_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Saldo Final: " + (saldo * 1.01));
		
		sc.close();
	}
}

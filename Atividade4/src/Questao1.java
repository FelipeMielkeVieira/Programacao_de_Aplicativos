import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao, num1, num2;
		
		System.out.println("Digite a op��o desejada: \n1 - Somar 2 n�meros \n2 - Raiz quadrada de um n�mero");
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.print("Digite o primeiro n�mero: ");
			num1 = sc.nextInt();
			
			System.out.print("Digite o segundo n�mero: ");
			num2 = sc.nextInt();
			
			System.out.println("Soma: " + (num1 + num2));
		} else if (opcao == 2) {
			System.out.print("Digite o n�mero: ");
			num1 = sc.nextInt();
			
			System.out.println("Raiz: " + Math.sqrt(num1));
		} else {
			System.out.println("Op��o Inv�lida!");
		}
	
		sc.close();
	}
}

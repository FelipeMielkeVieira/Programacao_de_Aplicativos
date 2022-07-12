import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao, num1, num2;
		
		System.out.println("Digite a opção desejada: \n1 - Somar 2 números \n2 - Raiz quadrada de um número");
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.print("Digite o primeiro número: ");
			num1 = sc.nextInt();
			
			System.out.print("Digite o segundo número: ");
			num2 = sc.nextInt();
			
			System.out.println("Soma: " + (num1 + num2));
		} else if (opcao == 2) {
			System.out.print("Digite o número: ");
			num1 = sc.nextInt();
			
			System.out.println("Raiz: " + Math.sqrt(num1));
		} else {
			System.out.println("Opção Inválida!");
		}
	
		sc.close();
	}
}

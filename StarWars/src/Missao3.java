import java.util.Scanner;

public class Missao3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao, qtd;
		double num1, num2;
		
		do {
			System.out.println(
					"----- Menu -----\n0 - Sair \n1 - Adi��o \n2 - Subtra��o \n3 - Multiplica��o \n4 - Divis�o \n5 - Pot�ncia \n6 - Porcentagem \n7 - Raiz Quadrada");
			opcao = sc.nextInt();

			System.out.print("Quantidade de N�meros: ");
			qtd = sc.nextInt();
			
			if(qtd < 1 || qtd > 5) {
				System.out.println("Quantidade Inv�lida!");
			} else {
				
				switch(opcao) {
				case 1:
					
					if(qtd < 2) {
						System.out.println("Quantidade Inv�lida!");
						break;
					}
					
					int soma = 0;
					for(int i = 0; i < qtd; i++) {
						System.out.print("N�mero " + (i + 1) + ": ");
						num1 = sc.nextInt();
						soma += num1;
					}
					System.out.println("Soma = " + soma);
					break;
				case 2:
					
					if(qtd < 2) {
						System.out.println("Quantidade Inv�lida!");
						break;
					}
					
					int subtracao = 0;
					for(int i = 0; i < qtd; i++) {
						System.out.print("N�mero " + (i + 1) + ": ");
						num1 = sc.nextInt();
						subtracao -= num1;
					}
					System.out.println("Subtra��o = " + subtracao);
					break;
				case 3:
					
					if(qtd < 2) {
						System.out.println("Quantidade Inv�lida!");
						break;
					}
					
					int multiplicacao = 0;
					for(int i = 0; i < qtd; i++) {
						System.out.print("N�mero " + (i + 1) + ": ");
						num1 = sc.nextInt();
						multiplicacao *= num1;
					}
					System.out.println("Multiplica��o = " + multiplicacao);
					break;
				case 4:
					
					if(qtd != 2) {
						System.out.println("Quantidade Inv�lida!");
						break;
					}
					
					int divisao = 0;
					for(int i = 0; i < qtd; i++) {
						System.out.print("N�mero " + (i + 1) + ": ");
						num1 = sc.nextInt();
						divisao /= num1;
					}
					System.out.println("Divis�o = " + divisao);
					break;
				case 5:
					
					if(qtd != 2) {
						System.out.println("Quantidade Inv�lida!");
						break;
					}
					
					double potencia = 0;
					System.out.print("N�mero 1: ");
					num1 = sc.nextDouble();
					
					System.out.print("N�mero 2: ");
					num2 = sc.nextDouble();
					
					potencia = Math.pow(num1,  num2);
					System.out.println("Pot�ncia = " + potencia);
					break;
				case 6:
					
					if(qtd != 2) {
						System.out.println("Quantidade Inv�lida!");
						break;
					}
					
					double porcentagem = 0;
					System.out.print("N�mero 1: ");
					num1 = sc.nextDouble();
					
					System.out.print("N�mero 2: ");
					num2 = sc.nextDouble();
					
					porcentagem = num2 * 100 / num1;
					System.out.println("Porcentagem = " + porcentagem + "%");
					break;
				case 7:
					
					if(qtd != 1) {
						System.out.println("Quantidade Inv�lida!");
						break;
					}
					
					System.out.print("N�mero: ");
					num1 = sc.nextDouble();
					double raiz = Math.sqrt(num1);
					
					System.out.println("Raiz Quadrada = " + raiz);
					break;
				}
			}

		} while (opcao != 0);
		
		sc.close();
	}
}

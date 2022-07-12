import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de Livros: ");
		int qtd = sc.nextInt();
		
		double valorA = 0.25 * qtd + 7.5;
		double valorB = 0.5 * qtd + 2.5;
		
		int melhorEscolha;
		if(valorA > valorB) {
			melhorEscolha = 1;
		} else {
			melhorEscolha = 2;
		}
		
		switch(melhorEscolha) {
		case 1:
			System.out.println("A melhor opção é a 'A' - R$ " + valorA);
			break;
		case 2:
			System.out.println("A melhor opção é a 'B' - R$ " + valorB);
			break;
		}
		
		sc.close();
	}
}

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double soma = 0, maior = 0, menor = 0, media = 0, impares = 0, pares = 0;
		int contagem = 0;
		
		System.out.print("N�mero: ");
		double num = sc.nextDouble();
		
		while(num != 30000) {
			soma += num;
			contagem++;
			
			if(contagem == 1) {
				menor = num;
				maior = num;
			}
			if(num > maior) {
				maior = num;
			}
			if(num < menor) {
				menor = num;
			}
			
			if(num % 2 == 0) {
				pares++;
				media = (media + num) / pares;
			} else {
				impares++;
			}
			
			System.out.print("N�mero: ");
			num = sc.nextDouble();
		}
		
		double porcentagem = impares / contagem * 100;
		System.out.println("Soma dos N�meros: " + soma +
				"\nQuantidade de N�meros: " + contagem +
				"\nMaior N�mero: " + maior +
				"\nMenor N�mero: " + menor +
				"\nM�dia dos N�meros Pares: " + media +
				"\nPorcentagem dos �mpares sobre o Total: " + porcentagem + "%");
		
		sc.close();
	}
}

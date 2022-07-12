import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double totalProduto = 0, valorTotal, imposto = 0;
		
		System.out.print("Código do produto: ");
		int codigo = sc.nextInt();
		
		System.out.print("Peso do Produto: ");
		double peso = sc.nextDouble();
		
		System.out.print("Código do País de Origem: ");
		int codigoPais = sc.nextInt();
		
		switch(codigo) {
		case 1:
			totalProduto = peso * 1000 * 10;
			break;
		case 2:
			totalProduto = peso * 1000 * 10;
			break;
		case 3:
			totalProduto = peso * 1000 * 10;
			break;
		case 4:
			totalProduto = peso * 1000 * 10;
			break;
		case 5:
			totalProduto = peso * 1000 * 25;
			break;
		case 6:
			totalProduto = peso * 1000 * 25;
			break;
		case 7:
			totalProduto = peso * 1000 * 25;
			break;
		case 8:
			totalProduto = peso * 1000 * 35;
			break;
		case 9:
			totalProduto = peso * 1000 * 35;
			break;
		case 10:
			totalProduto = peso * 1000 * 35;
			break;
		default:
			System.out.println("Código do Produto Inválido!");
			System.exit(0);
		}
		
		switch(codigoPais) {
		case 1:
			break;
		case 2:
			imposto = totalProduto * 0.15;
			break;
		case 3:
			imposto = totalProduto * 0.25;
			break;
		default:
			System.out.println("Código do País Inválido!");
			System.exit(0);
		}
		
		valorTotal = totalProduto + imposto;
		System.out.println("Peso Total: " + peso + " kg");
		System.out.println("Preço Total do Produto: R$ " + totalProduto);
		System.out.println("Valor do Impsoto: R$ " + imposto);
		System.out.println("Valor Total: R$ " + valorTotal);
		
		sc.close();
	}
}
